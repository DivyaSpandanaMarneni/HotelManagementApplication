
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object AddRoomSuccess_Scope0 {
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

class AddRoomSuccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(roomNumber:Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>2 Column Layout &mdash; Right Menu with Header &amp; Footer</title>
    <style type="text/css">
ul """),format.raw/*8.4*/("""{"""),format.raw/*8.5*/("""
    """),format.raw/*9.5*/("""list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/("""

"""),format.raw/*16.1*/("""li """),format.raw/*16.4*/("""{"""),format.raw/*16.5*/("""
    """),format.raw/*17.5*/("""float: left;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""

"""),format.raw/*20.1*/("""li a """),format.raw/*20.6*/("""{"""),format.raw/*20.7*/("""
    """),format.raw/*21.5*/("""display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
"""),format.raw/*26.1*/("""}"""),format.raw/*26.2*/("""

"""),format.raw/*28.1*/("""li a:hover """),format.raw/*28.12*/("""{"""),format.raw/*28.13*/("""
    """),format.raw/*29.5*/("""background-color: #111;
"""),format.raw/*30.1*/("""}"""),format.raw/*30.2*/("""
    """),format.raw/*31.5*/("""body """),format.raw/*31.10*/("""{"""),format.raw/*31.11*/("""
      """),format.raw/*32.7*/("""margin:0;
      padding:0;
      font-family: Sans-Serif;
      line-height: 1.5em;
    """),format.raw/*36.5*/("""}"""),format.raw/*36.6*/("""

    """),format.raw/*38.5*/("""header """),format.raw/*38.12*/("""{"""),format.raw/*38.13*/("""
      """),format.raw/*39.7*/("""background: #ccc;
      height: 100px;
      background-color: #00008B;
background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*43.5*/("""}"""),format.raw/*43.6*/("""

    """),format.raw/*45.5*/("""header h1 """),format.raw/*45.15*/("""{"""),format.raw/*45.16*/("""
      """),format.raw/*46.7*/("""margin: 0;
      padding-top: 15px;
      background-color: #00008B;
background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*50.5*/("""}"""),format.raw/*50.6*/("""

    """),format.raw/*52.5*/("""main """),format.raw/*52.10*/("""{"""),format.raw/*52.11*/("""
      """),format.raw/*53.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 100%;
      background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*58.5*/("""}"""),format.raw/*58.6*/("""

    """),format.raw/*60.5*/("""nav """),format.raw/*60.9*/("""{"""),format.raw/*60.10*/("""
      """),format.raw/*61.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 230px;
      margin-left: -230px;
      background: #eee;
    """),format.raw/*67.5*/("""}"""),format.raw/*67.6*/("""

    """),format.raw/*69.5*/("""footer """),format.raw/*69.12*/("""{"""),format.raw/*69.13*/("""
      """),format.raw/*70.7*/("""clear: left;
      width: 100%;
      text-align: center;
      padding: 4px 0;
      background-color: #FFFFFF;
      text-color:#000000;
    """),format.raw/*76.5*/("""}"""),format.raw/*76.6*/("""


    """),format.raw/*79.5*/("""#wrapper """),format.raw/*79.14*/("""{"""),format.raw/*79.15*/("""
      """),format.raw/*80.7*/("""overflow: hidden;
    """),format.raw/*81.5*/("""}"""),format.raw/*81.6*/("""

    """),format.raw/*83.5*/("""#content """),format.raw/*83.14*/("""{"""),format.raw/*83.15*/("""
      """),format.raw/*84.7*/("""margin-right: 230px; /* Same as 'nav' width */
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""

    """),format.raw/*87.5*/(""".innertube """),format.raw/*87.16*/("""{"""),format.raw/*87.17*/("""
      """),format.raw/*88.7*/("""margin: 15px; /* Padding for content */
      margin-top: 0;
      background-color: #FFFFFF;
            text-color:#000000;
    """),format.raw/*92.5*/("""}"""),format.raw/*92.6*/("""

    """),format.raw/*94.5*/("""p """),format.raw/*94.7*/("""{"""),format.raw/*94.8*/("""
      """),format.raw/*95.7*/("""color: #555;
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""

    """),format.raw/*98.5*/("""nav ul """),format.raw/*98.12*/("""{"""),format.raw/*98.13*/("""
      """),format.raw/*99.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
    """),format.raw/*102.5*/("""}"""),format.raw/*102.6*/("""

    """),format.raw/*104.5*/("""nav ul a """),format.raw/*104.14*/("""{"""),format.raw/*104.15*/("""
      """),format.raw/*105.7*/("""color: darkgreen;
      text-decoration: none;
    """),format.raw/*107.5*/("""}"""),format.raw/*107.6*/("""

    """),format.raw/*109.5*/("""</style>

  </head>

  <body>

<div align="center" >
<h1><a> Hotel Management System</a></h1>
</div>
       

<ul>
    <li><a class="active" href=""""),_display_(/*121.34*/routes/*121.40*/.RedirectionController.redirectHome()),format.raw/*121.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*122.19*/routes/*122.25*/.RedirectionController.redirectAdmin()),format.raw/*122.63*/("""">Admin</a></li>
    <li><a class="active" href=""""),_display_(/*123.34*/routes/*123.40*/.RedirectionController.redirectAdminWaiter()),format.raw/*123.84*/("""">Assign Waiter</a></li>
    <li><a href=""""),_display_(/*124.19*/routes/*124.25*/.RedirectionController.redirectAdminAddRoom()),format.raw/*124.70*/("""">Rooms</a></li>
    <li><a href=""""),_display_(/*125.19*/routes/*125.25*/.RedirectionController.redirectAdminAddRoomType()),format.raw/*125.74*/("""">Room Type</a></li>
      </ul>
      <br>
 <div id="wrapper">

      <main>
        
          
            <h1> Administrator  </h1>
            <h2> The room """),_display_(/*134.28*/roomNumber),format.raw/*134.38*/(""" """),format.raw/*134.39*/("""has been added successfully</h2>
            <p><script>generateText(20)</script></p>
       
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

  def render(roomNumber:Integer): play.twirl.api.HtmlFormat.Appendable = apply(roomNumber)

  def f:((Integer) => play.twirl.api.HtmlFormat.Appendable) = (roomNumber) => apply(roomNumber)

  def ref: this.type = this

}


}

/**/
object AddRoomSuccess extends AddRoomSuccess_Scope0.AddRoomSuccess
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:20:03 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/AddRoomSuccess.scala.html
                  HASH: 94e8ff7758908d6020925abc58b22d046fec4082
                  MATRIX: 764->1|879->21|907->23|1153->243|1180->244|1212->250|1348->359|1376->360|1407->364|1437->367|1465->368|1498->374|1539->388|1567->389|1598->393|1630->398|1658->399|1691->405|1832->519|1860->520|1891->524|1930->535|1959->536|1992->542|2044->567|2072->568|2105->574|2138->579|2167->580|2202->588|2321->680|2349->681|2384->689|2419->696|2448->697|2483->705|2641->836|2669->837|2704->845|2742->855|2771->856|2806->864|2961->992|2989->993|3024->1001|3057->1006|3086->1007|3121->1015|3308->1175|3336->1176|3371->1184|3402->1188|3431->1189|3466->1197|3649->1353|3677->1354|3712->1362|3747->1369|3776->1370|3811->1378|3987->1527|4015->1528|4052->1538|4089->1547|4118->1548|4153->1556|4203->1579|4231->1580|4266->1588|4303->1597|4332->1598|4367->1606|4446->1658|4474->1659|4509->1667|4548->1678|4577->1679|4612->1687|4773->1821|4801->1822|4836->1830|4865->1832|4893->1833|4928->1841|4973->1859|5001->1860|5036->1868|5071->1875|5100->1876|5135->1884|5228->1949|5257->1950|5293->1958|5331->1967|5361->1968|5397->1976|5478->2029|5507->2030|5543->2038|5731->2198|5747->2204|5806->2241|5869->2276|5885->2282|5945->2320|6024->2371|6040->2377|6106->2421|6178->2465|6194->2471|6261->2516|6325->2552|6341->2558|6412->2607|6612->2779|6644->2789|6674->2790
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|57->26|57->26|59->28|59->28|59->28|60->29|61->30|61->30|62->31|62->31|62->31|63->32|67->36|67->36|69->38|69->38|69->38|70->39|74->43|74->43|76->45|76->45|76->45|77->46|81->50|81->50|83->52|83->52|83->52|84->53|89->58|89->58|91->60|91->60|91->60|92->61|98->67|98->67|100->69|100->69|100->69|101->70|107->76|107->76|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|123->92|123->92|125->94|125->94|125->94|126->95|127->96|127->96|129->98|129->98|129->98|130->99|133->102|133->102|135->104|135->104|135->104|136->105|138->107|138->107|140->109|152->121|152->121|152->121|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|165->134|165->134|165->134
                  -- GENERATED --
              */
          