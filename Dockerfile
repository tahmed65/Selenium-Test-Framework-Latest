FROM ubuntu:22.04

# Install Apache
RUN apt-get update && \
    apt-get install -y apache2 && \
    apt-get clean && \
    rm -rf /var/lib/apt/lists/*

# Remove default Apache config and files
RUN rm -rf /var/www/html/*

# Create dedicated directory for the reports
RUN mkdir -p /var/www/html/reports

# Copy the cucumber reports
COPY TestFramework/target/cucumber-html-reports/ /var/www/html/reports/

# Create a custom index.html that loads the reports directly
RUN echo '<!DOCTYPE html>\
<html>\
<head>\
    <title>Test Automation Reports</title>\
    <meta http-equiv="refresh" content="0; url=/reports/overview-features.html">\
    <style>\
        body { font-family: Arial, sans-serif; text-align: center; padding: 50px; }\
        .loader { margin: 20px auto; }\
    </style>\
</head>\
<body>\
    <h1>Loading Test Reports...</h1>\
    <div class="loader">Please wait...</div>\
    <p>If you are not redirected, <a href="/reports/overview-features.html">click here</a></p>\
</body>\
</html>' > /var/www/html/index.html

# Configure Apache
RUN echo '<VirtualHost *:80>\n\
    DocumentRoot /var/www/html\n\
    <Directory /var/www/html>\n\
        Options -Indexes +FollowSymLinks\n\
        AllowOverride All\n\
        Require all granted\n\
    </Directory>\n\
</VirtualHost>' > /etc/apache2/sites-available/000-default.conf

# Enable required Apache modules
RUN a2enmod rewrite

# Set correct permissions
RUN chown -R www-data:www-data /var/www/html && \
    chmod -R 755 /var/www/html

EXPOSE 80

CMD ["apache2ctl", "-D", "FOREGROUND"]
