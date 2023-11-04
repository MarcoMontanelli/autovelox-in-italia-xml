<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
    <head>
      <title>LISTA DI AUTOVELOX ATTIVI IN ITALIA PER COMUNE, REGIONE E CON LE RELATIVE COORDINATE</title>
      <style>
        body {
          font-family: Arial, sans-serif;
          background-color: #f0f0f0;
          padding: 20px;
        }
        .container {
          width: 80%;
          margin: 0 auto;
          background-color: #ffffff;
          box-shadow: 0px 0px 20px 0px rgba(0, 0, 0, 0.1);
          border-radius: 10px;
          padding: 20px;
        }
        h1 {
          color: #8f00ff;
          text-align: center;
        }
        table {
          width: 100%;
          border-collapse: collapse;
          margin-top: 20px;
          border-radius: 10px;
        }
        th, td {
          text-align: left;
          padding: 15px;
          border-bottom: 1px solid #ddd;
        }
        th {
          background-color: #8f00ff;
          color: white;
        }
        tr:nth-child(even) {
          background-color: #f2f2f2;
        }
      </style>
    </head>
    <body>
      <div class="container">
        <h1>LISTA DI AUTOVELOX ATTIVI IN ITALIA PER COMUNE, REGIONE E CON LE RELATIVE COORDINATE</h1>
        <table>
          <tr>
            <th>Classe</th>
            <th>Comune</th>
            <th>Provincia</th>
            <th>Regione</th>
            <th>Nome</th>
            <th>Anno_inserimento</th>
            <th>Data_e_ora_inserimento</th>
            <th>Identificatore_in_OpenStreetMap</th>
            <th>Longitudine</th>
            <th>Latitudine</th>
          </tr>
          <xsl:apply-templates select="autovelox_in_italia/rilevatore" />
        </table>
      </div>
      </body>
    </html>
  </xsl:template>

  <xsl:template match="rilevatore">
    <tr>
      <td><xsl:value-of select="Comune/classe/@nome" /></td>
      <td><xsl:value-of select="Comune/@nm" /></td>
      <td><xsl:value-of select="Provincia" /></td>
      <td><xsl:value-of select="Regione" /></td>
      <td><xsl:value-of select="nome" /></td>
      <td><xsl:value-of select="Anno_inserimento" /></td>
      <td><xsl:value-of select="Data_e_ora_inserimento" /></td>
      <td><xsl:value-of select="Identificatore_in_OpenStreetMap" /></td>
      <td><xsl:value-of select="Longitudine" /></td>
      <td><xsl:value-of select="Latitudine" /></td>
    </tr>
  </xsl:template>
</xsl:stylesheet>
