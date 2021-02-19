<!DOCTYPE helpset
  PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 2.0//EN"
         "http://java.sun.com/products/javahelp/helpset_2_0.dtd">

<helpset version="2.0">
    <!-- title -->
    <title>Prueba</title>

    <!-- maps -->
    <maps>
        <homeID>Index</homeID>
        <mapref location="map.jhm" />
    </maps>

    <!-- views -->
        <view xml:lang="en" mergetype="javax.help.UniteAppendMerge">
        <name>TOC</name>
        <label>Tabla de Contenidos</label>
        <type>javax.help.TOCView</type>
        <data>TOC.xml</data>
    </view>


    <view xml:lang="en" mergetype="javax.help.SortMerge">
        <name>Index</name>
        <label>Index</label>
        <type>javax.help.IndexView</type>
        <data>index.html</data>
    </view>

    <view xml:lang="en" mergetype="javax.help.SortMerge">
        <name>Test</name>
        <label>Test</label>
        <type>javax.help.TestView</type>
        <data>Test.html</data>
    </view>


</helpset>