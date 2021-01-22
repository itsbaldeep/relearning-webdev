<?xml version="1.0"?>

<!-- everything is written between the xsl:stylesheet tags -->
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <!-- making a template for whole document ("/") -->
    <xsl:template match="/">
        <!-- this will be just like an html document -->
        <html>
            <head>
                <title>XSLT Basics</title>
                <!-- doing styling using internal css -->
                <style type="text/css">
                    body { background-color: gray; }
                    .heading { font-size: 26px; font-weight: 600; }
                    .description { display: block; }
                </style>
            </head>
            <body>
                <!-- this is what will be displayed on the browser -->
                <h2>XML Transformation</h2>
                <!-- the template made for test element will be displayed here -->
                <xsl:apply-templates/>
            </body>
        </html>
    </xsl:template>

    <!-- making a template for test element (root element of the xml file) -->
    <xsl:template match="test">
        <span class="heading"><xsl:value-of select="heading"/></span>
        <span class="description"><xsl:value-of select="description"/></span>
    </xsl:template>
</xsl:stylesheet>
