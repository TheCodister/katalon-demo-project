<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_main</name>
   <tag></tag>
   <elementGuidId>7f2280fd-3e40-4ea5-8834-0acab8e0578b</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//*[@id = 'main']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#main</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <smartLocatorCollection>
      <entry>
         <key>SMART_LOCATOR</key>
         <value>internal:text=&quot;HTML Canvas Graphics ❮ Previous Next ❯ Smile! The HTML &lt;canvas> element is used &quot;i</value>
      </entry>
   </smartLocatorCollection>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
      <webElementGuid>bcfe3ead-4a42-4529-b506-211aedc4e410</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>w3-col l10 m12</value>
      <webElementGuid>ca4bdf5f-fad0-481f-8725-138dbee233d4</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>main</value>
      <webElementGuid>f9d10d77-1fb0-498b-8ae6-0363d30b58ed</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>main</value>
      <webElementGuid>cc6be47b-5617-426a-b62d-dd029bdc8f11</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>@text</name>
      <type>Main</type>
      <value>HTML Canvas Graphics
❮ Previous
Next ❯

The HTML &lt;canvas> element is used to draw graphics on a web page.

The graphic to the left is created with &lt;canvas>. It shows four elements: a red rectangle, a gradient rectangle, a multicolor rectangle, and a multicolor text.

What is HTML Canvas?

The HTML &lt;canvas> element is used to draw graphics, on the fly, via JavaScript.

The &lt;canvas> element is only a container for graphics. You must use JavaScript to actually draw the graphics.

Canvas has several methods for drawing paths, boxes, circles, text, and adding images.

Canvas is supported by all major browsers.

Canvas Examples

A canvas is a rectangular area on an HTML page. By default, a canvas has no border and no content.

The markup looks like this:

&lt;canvas id=&quot;myCanvas&quot; width=&quot;200&quot; height=&quot;100&quot;>&lt;/canvas>

Note: Always specify an id attribute (to be referred to in a script), and a width and height attribute to define the size of the canvas. To add a border, use the style attribute.

Here is an example of a basic, empty canvas:

Example
&lt;canvas id=&quot;myCanvas&quot; width=&quot;200&quot; height=&quot;100&quot; style=&quot;border:1px solid #000000;&quot;>
&lt;/canvas>
Try it Yourself »
Add a JavaScript

After creating the rectangular canvas area, you must add a JavaScript to do the drawing.

Here are some examples:

Draw a Line
Example
&lt;script>
var c = document.getElementById(&quot;myCanvas&quot;);
var ctx = c.getContext(&quot;2d&quot;);
ctx.moveTo(0, 0);
ctx.lineTo(200, 100);
ctx.stroke();
&lt;/script>
Try it Yourself »
Draw a Circle
Example
&lt;script>
var c = document.getElementById(&quot;myCanvas&quot;);
var ctx = c.getContext(&quot;2d&quot;);
ctx.beginPath();
ctx.arc(95, 50, 40, 0, 2 * Math.PI);
ctx.stroke();
&lt;/script>
Try it Yourself »
Draw a Text
Example
&lt;script>
var c = document.getElementById(&quot;myCanvas&quot;);
var ctx = c.getContext(&quot;2d&quot;);
ctx.font = &quot;30px Arial&quot;;
ctx.fillText(&quot;Hello World&quot;, 10, 50);
&lt;/script>
Try it Yourself »
Stroke Text
Example
&lt;script>
var c = document.getElementById(&quot;myCanvas&quot;);
var ctx = c.getContext(&quot;2d&quot;);
ctx.font = &quot;30px Arial&quot;;
ctx.strokeText(&quot;Hello World&quot;, 10, 50);
&lt;/script>
Try it Yourself »
Draw Linear Gradient
Example
&lt;script>
var c = document.getElementById(&quot;myCanvas&quot;);
var ctx = c.getContext(&quot;2d&quot;);

// Create gradient
var grd = ctx.createLinearGradient(0, 0, 200, 0);
grd.addColorStop(0, &quot;red&quot;);
grd.addColorStop(1, &quot;white&quot;);

// Fill with gradient
ctx.fillStyle = grd;
ctx.fillRect(10, 10, 150, 80);
&lt;/script>
Try it Yourself »
Draw Circular Gradient
Example
&lt;script>
var c = document.getElementById(&quot;myCanvas&quot;);
var ctx = c.getContext(&quot;2d&quot;);

// Create gradient
var grd = ctx.createRadialGradient(75, 50, 5, 90, 60, 100);
grd.addColorStop(0, &quot;red&quot;);
grd.addColorStop(1, &quot;white&quot;);

// Fill with gradient
ctx.fillStyle = grd;
ctx.fillRect(10, 10, 150, 80);
&lt;/script>
Try it Yourself »
Draw Image
Example
&lt;script>
var c = document.getElementById(&quot;myCanvas&quot;);
var ctx = c.getContext(&quot;2d&quot;);
var img = document.getElementById(&quot;scream&quot;);
ctx.drawImage(img, 10, 10);
&lt;/script>
Try it Yourself »
HTML Canvas Tutorial

To learn more about &lt;canvas>, please read our HTML Canvas Tutorial.



❮ Previous
Next ❯
 
Track your progress - it's free!
 
Log in
Sign Up</value>
      <webElementGuid>44638b60-9ec7-4fc4-a302-0bfcf82a1fa6</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>parent</name>
      <type>Main</type>
      <value>md5.v1-862b29e59707236f01d1167f6cb5e08a</value>
      <webElementGuid>ae941467-d832-43c5-b3f8-4b8aaac3f53f</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>//*[@id = 'main']</value>
      <webElementGuid>ce98d627-36d8-4520-a38e-e709c6549fe9</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//*[@id = 'main']</value>
      <webElementGuid>d1502646-af0d-4618-a3ce-0f6f3256b09f</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//div[@id = 'main' and (text() = 'main' or . = 'main')]</value>
      <webElementGuid>414dffe9-3674-447b-838e-df23d3030e76</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
