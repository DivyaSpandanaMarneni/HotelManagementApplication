
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object NoBooking_Scope0 {
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

class NoBooking extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
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
    <li><a class="active" href=""""),_display_(/*119.34*/routes/*119.40*/.RedirectionController.redirectHome()),format.raw/*119.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*120.19*/routes/*120.25*/.RedirectionController.redirectGuest()),format.raw/*120.63*/("""">Guest</a></li>
    <li><a class="active" href=""""),_display_(/*121.34*/routes/*121.40*/.RedirectionController.redirectBookRoom()),format.raw/*121.81*/("""">Book Room</a></li>
    <li><a href=""""),_display_(/*122.19*/routes/*122.25*/.RedirectionController.redirectBookingStatus()),format.raw/*122.71*/("""">Check Status</a></li>
</ul>

    <div id="wrapper">

      <main>

            <h1> Reservation Details  </h1>
            <h2> Failed to reserve a room </h2>
            <p><script>generateText(20)</script></p>

            <form>
              <div>
                <h4> There are no such rooms available for the requested dates</h4>
              </div>
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
object NoBooking extends NoBooking_Scope0.NoBooking
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 19:02:45 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/NoBooking.scala.html
                  HASH: 967c715d83c7ccc192b72bda6eff7763a53b3037
                  MATRIX: 835->2|1081->222|1108->223|1140->229|1276->338|1304->339|1335->343|1365->346|1393->347|1426->353|1467->367|1495->368|1526->372|1558->377|1586->378|1619->384|1760->498|1788->499|1819->503|1858->514|1887->515|1920->521|1972->546|2000->547|2033->553|2066->558|2095->559|2130->567|2249->659|2277->660|2312->668|2347->675|2376->676|2411->684|2569->815|2597->816|2632->824|2670->834|2699->835|2734->843|2889->971|2917->972|2952->980|2985->985|3014->986|3049->994|3236->1154|3264->1155|3299->1163|3330->1167|3359->1168|3394->1176|3577->1332|3605->1333|3640->1341|3675->1348|3704->1349|3739->1357|3915->1506|3943->1507|3980->1517|4017->1526|4046->1527|4081->1535|4131->1558|4159->1559|4194->1567|4231->1576|4260->1577|4295->1585|4374->1637|4402->1638|4437->1646|4476->1657|4505->1658|4540->1666|4701->1800|4729->1801|4764->1809|4793->1811|4821->1812|4856->1820|4901->1838|4929->1839|4964->1847|4999->1854|5028->1855|5063->1863|5156->1928|5185->1929|5221->1937|5259->1946|5289->1947|5325->1955|5406->2008|5435->2009|5471->2017|5648->2166|5664->2172|5723->2209|5786->2244|5802->2250|5862->2288|5941->2339|5957->2345|6020->2386|6088->2426|6104->2432|6172->2478
                  LINES: 32->2|38->8|38->8|39->9|44->14|44->14|46->16|46->16|46->16|47->17|48->18|48->18|50->20|50->20|50->20|51->21|56->26|56->26|58->28|58->28|58->28|59->29|60->30|60->30|61->31|61->31|61->31|62->32|66->36|66->36|68->38|68->38|68->38|69->39|73->43|73->43|75->45|75->45|75->45|76->46|80->50|80->50|82->52|82->52|82->52|83->53|88->58|88->58|90->60|90->60|90->60|91->61|97->67|97->67|99->69|99->69|99->69|100->70|106->76|106->76|109->79|109->79|109->79|110->80|111->81|111->81|113->83|113->83|113->83|114->84|115->85|115->85|117->87|117->87|117->87|118->88|122->92|122->92|124->94|124->94|124->94|125->95|126->96|126->96|128->98|128->98|128->98|129->99|132->102|132->102|134->104|134->104|134->104|135->105|137->107|137->107|139->109|149->119|149->119|149->119|150->120|150->120|150->120|151->121|151->121|151->121|152->122|152->122|152->122
                  -- GENERATED --
              */
          