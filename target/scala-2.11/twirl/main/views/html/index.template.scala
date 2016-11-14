
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>

<html>
    
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        
<title>2 Column Layout &mdash; Right Menu with Header &amp; Footer</title>
        
    <style type="text/css">
ul """),format.raw/*11.4*/("""{"""),format.raw/*11.5*/("""
    """),format.raw/*12.5*/("""list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""

"""),format.raw/*19.1*/("""li """),format.raw/*19.4*/("""{"""),format.raw/*19.5*/("""
    """),format.raw/*20.5*/("""float: left;
"""),format.raw/*21.1*/("""}"""),format.raw/*21.2*/("""

"""),format.raw/*23.1*/("""li a """),format.raw/*23.6*/("""{"""),format.raw/*23.7*/("""
    """),format.raw/*24.5*/("""display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""

"""),format.raw/*31.1*/("""li a:hover """),format.raw/*31.12*/("""{"""),format.raw/*31.13*/("""
    """),format.raw/*32.5*/("""background-color: #111;
"""),format.raw/*33.1*/("""}"""),format.raw/*33.2*/("""
    """),format.raw/*34.5*/("""body """),format.raw/*34.10*/("""{"""),format.raw/*34.11*/("""
      """),format.raw/*35.7*/("""margin:0;
      padding:0;
      font-family: Sans-Serif;
      line-height: 1.5em;
    """),format.raw/*39.5*/("""}"""),format.raw/*39.6*/("""

    """),format.raw/*41.5*/("""header """),format.raw/*41.12*/("""{"""),format.raw/*41.13*/("""
      """),format.raw/*42.7*/("""background: #ccc;
      height: 100px;
      background-color: #00008B;
background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*46.5*/("""}"""),format.raw/*46.6*/("""

    """),format.raw/*48.5*/("""header h1 """),format.raw/*48.15*/("""{"""),format.raw/*48.16*/("""
      """),format.raw/*49.7*/("""margin: 0;
      padding-top: 15px;
      background-color: #00008B;
background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*53.5*/("""}"""),format.raw/*53.6*/("""

    """),format.raw/*55.5*/("""main """),format.raw/*55.10*/("""{"""),format.raw/*55.11*/("""
      """),format.raw/*56.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 100%;
      background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*61.5*/("""}"""),format.raw/*61.6*/("""

    """),format.raw/*63.5*/("""nav """),format.raw/*63.9*/("""{"""),format.raw/*63.10*/("""
      """),format.raw/*64.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 230px;
      margin-left: -230px;
      background: #eee;
    """),format.raw/*70.5*/("""}"""),format.raw/*70.6*/("""

    """),format.raw/*72.5*/("""footer """),format.raw/*72.12*/("""{"""),format.raw/*72.13*/("""
      """),format.raw/*73.7*/("""clear: left;
      width: 100%;
      text-align: center;
      padding: 4px 0;
      background-color: #FFFFFF;
      text-color:#000000;
    """),format.raw/*79.5*/("""}"""),format.raw/*79.6*/("""


    """),format.raw/*82.5*/("""#wrapper """),format.raw/*82.14*/("""{"""),format.raw/*82.15*/("""
      """),format.raw/*83.7*/("""overflow: hidden;
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/("""

    """),format.raw/*86.5*/("""#content """),format.raw/*86.14*/("""{"""),format.raw/*86.15*/("""
      """),format.raw/*87.7*/("""margin-right: 230px; /* Same as 'nav' width */
    """),format.raw/*88.5*/("""}"""),format.raw/*88.6*/("""

    """),format.raw/*90.5*/(""".innertube """),format.raw/*90.16*/("""{"""),format.raw/*90.17*/("""
      """),format.raw/*91.7*/("""margin: 15px; /* Padding for content */
      margin-top: 0;
      background-color: #FFFFFF;
            text-color:#000000;
    """),format.raw/*95.5*/("""}"""),format.raw/*95.6*/("""

    """),format.raw/*97.5*/("""p """),format.raw/*97.7*/("""{"""),format.raw/*97.8*/("""
      """),format.raw/*98.7*/("""color: #555;
    """),format.raw/*99.5*/("""}"""),format.raw/*99.6*/("""

    """),format.raw/*101.5*/("""nav ul """),format.raw/*101.12*/("""{"""),format.raw/*101.13*/("""
      """),format.raw/*102.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
    """),format.raw/*105.5*/("""}"""),format.raw/*105.6*/("""

    """),format.raw/*107.5*/("""nav ul a """),format.raw/*107.14*/("""{"""),format.raw/*107.15*/("""
      """),format.raw/*108.7*/("""color: darkgreen;
      text-decoration: none;
    """),format.raw/*110.5*/("""}"""),format.raw/*110.6*/("""

    """),format.raw/*112.5*/("""</style>    
</head>

    
<body>

        
               
<div align="center" >
<h1><a> Hotel Management System</a></h1>
</div>          
<ul>
  <li><a class="active" href=""""),_display_(/*124.32*/routes/*124.38*/.RedirectionController.redirectHome()),format.raw/*124.75*/("""">Home</a></li>
  <li><a href=""""),_display_(/*125.17*/routes/*125.23*/.RedirectionController.redirectGuest()),format.raw/*125.61*/("""">Guest</a></li>
  <li><a href=""""),_display_(/*126.17*/routes/*126.23*/.RedirectionController.redirectAdmin()),format.raw/*126.61*/("""">Admin</a></li>
</ul>       
<div id="wrapper">

            
<main>
                
                       
<h1> Welcome To Marriot </h1>
                        
<p><script>generateText(20)</script></p>

                        
<form method="POST" action=""""),_display_(/*139.30*/routes/*139.36*/.HomeController.guestPage()),format.raw/*139.63*/("""">

                            
<br>
                            
<input type="submit" name="guest"  value="Guest">
                            
<br>
                            
<br>
                            
<br><input type="submit" name="admin" value="Administrator">
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
    <br>

    <br>
    <br>

    <br>
    <br>

    <br>
    <br>

    <br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                            
<br>
                        
</form>

                    
           
</main>

            
        
</div>

        
<footer>
            
<div class="innertube">
                
Project Members : Sujeet Kulkarni, Chen Chen Jiahao Xu, Divya Marneni Lovina Dmello
            
</div>
        
</footer>

    
</body>

</html>

"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:29:37 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/index.scala.html
                  HASH: 6783e323f3bbe54e5d71902e8756d9cf3f98bb20
                  MATRIX: 827->0|1092->238|1120->239|1153->245|1289->354|1317->355|1348->359|1378->362|1406->363|1439->369|1480->383|1508->384|1539->388|1571->393|1599->394|1632->400|1773->514|1801->515|1832->519|1871->530|1900->531|1933->537|1985->562|2013->563|2046->569|2079->574|2108->575|2143->583|2262->675|2290->676|2325->684|2360->691|2389->692|2424->700|2582->831|2610->832|2645->840|2683->850|2712->851|2747->859|2902->987|2930->988|2965->996|2998->1001|3027->1002|3062->1010|3249->1170|3277->1171|3312->1179|3343->1183|3372->1184|3407->1192|3590->1348|3618->1349|3653->1357|3688->1364|3717->1365|3752->1373|3928->1522|3956->1523|3993->1533|4030->1542|4059->1543|4094->1551|4144->1574|4172->1575|4207->1583|4244->1592|4273->1593|4308->1601|4387->1653|4415->1654|4450->1662|4489->1673|4518->1674|4553->1682|4714->1816|4742->1817|4777->1825|4806->1827|4834->1828|4869->1836|4914->1854|4942->1855|4978->1863|5014->1870|5044->1871|5080->1879|5173->1944|5202->1945|5238->1953|5276->1962|5306->1963|5342->1971|5423->2024|5452->2025|5488->2033|5704->2221|5720->2227|5779->2264|5840->2297|5856->2303|5916->2341|5978->2375|5994->2381|6054->2419|6357->2694|6373->2700|6422->2727
                  LINES: 32->1|42->11|42->11|43->12|48->17|48->17|50->19|50->19|50->19|51->20|52->21|52->21|54->23|54->23|54->23|55->24|60->29|60->29|62->31|62->31|62->31|63->32|64->33|64->33|65->34|65->34|65->34|66->35|70->39|70->39|72->41|72->41|72->41|73->42|77->46|77->46|79->48|79->48|79->48|80->49|84->53|84->53|86->55|86->55|86->55|87->56|92->61|92->61|94->63|94->63|94->63|95->64|101->70|101->70|103->72|103->72|103->72|104->73|110->79|110->79|113->82|113->82|113->82|114->83|115->84|115->84|117->86|117->86|117->86|118->87|119->88|119->88|121->90|121->90|121->90|122->91|126->95|126->95|128->97|128->97|128->97|129->98|130->99|130->99|132->101|132->101|132->101|133->102|136->105|136->105|138->107|138->107|138->107|139->108|141->110|141->110|143->112|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126|170->139|170->139|170->139
                  -- GENERATED --
              */
          