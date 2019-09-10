<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Bookshelf</title>
            </head>
            <body>
                <xsl:for-each select="bookshelf/book"/>
                    <xsl:value-of select="author"/>
                    <br/><xsl:value-of select="title"/>
                    <br/><xsl:value-of select="publisher"/>
                    <br/><xsl:value-of select="publishdate"/>
                    <br/><xsl:value-of select="description"/>
                    <br/><xsl:value-of select="location"/>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
