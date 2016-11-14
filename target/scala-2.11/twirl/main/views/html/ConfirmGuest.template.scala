
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ConfirmGuest_Scope0 {
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

class ConfirmGuest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(Id: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
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
    <li><a class="active" href=""""),_display_(/*118.34*/routes/*118.40*/.RedirectionController.redirectHome()),format.raw/*118.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*119.19*/routes/*119.25*/.RedirectionController.redirectGuest()),format.raw/*119.63*/("""">Guest</a></li>
    <li><a class="active" href=""""),_display_(/*120.34*/routes/*120.40*/.RedirectionController.redirectBookRoom()),format.raw/*120.81*/("""">Book Room</a></li>
    <li><a href=""""),_display_(/*121.19*/routes/*121.25*/.RedirectionController.redirectBookingStatus()),format.raw/*121.71*/("""">Check Status</a></li>
</ul>

    <div id="wrapper">

      <main>
            <h1> Confirmation </h1>
            <p><script>generateText(20)</script></p>

            <form method="POST" action=""""),_display_(/*130.42*/routes/*130.48*/.GuestPreferences.GuestPreferenceRedirect()),format.raw/*130.91*/("""">
<b>Your ID is :</b>
              <label for="id">"""),_display_(/*132.32*/content),format.raw/*132.39*/("""</label>
              <br>
              <input type="submit" value="Proceed to book a Room" name="actionEvent">
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

  def render(Id:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(Id)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (Id) => (content) => apply(Id)(content)

  def ref: this.type = this

}


}

/**/
object ConfirmGuest extends ConfirmGuest_Scope0.ConfirmGuest
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 19:02:44 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/ConfirmGuest.scala.html
                  HASH: ea460f32a6818800adfe6920c185550e169b0003
                  MATRIX: 764->1|886->28|914->30|1160->250|1187->251|1219->257|1355->366|1383->367|1414->371|1444->374|1472->375|1505->381|1546->395|1574->396|1605->400|1637->405|1665->406|1698->412|1839->526|1867->527|1898->531|1937->542|1966->543|1999->549|2051->574|2079->575|2112->581|2145->586|2174->587|2209->595|2328->687|2356->688|2391->696|2426->703|2455->704|2490->712|2648->843|2676->844|2711->852|2749->862|2778->863|2813->871|2968->999|2996->1000|3031->1008|3064->1013|3093->1014|3128->1022|3315->1182|3343->1183|3378->1191|3409->1195|3438->1196|3473->1204|3656->1360|3684->1361|3719->1369|3754->1376|3783->1377|3818->1385|3994->1534|4022->1535|4059->1545|4096->1554|4125->1555|4160->1563|4210->1586|4238->1587|4273->1595|4310->1604|4339->1605|4374->1613|4453->1665|4481->1666|4516->1674|4555->1685|4584->1686|4619->1694|4780->1828|4808->1829|4843->1837|4872->1839|4900->1840|4935->1848|4980->1866|5008->1867|5043->1875|5078->1882|5107->1883|5142->1891|5235->1956|5264->1957|5300->1965|5338->1974|5368->1975|5404->1983|5485->2036|5514->2037|5550->2045|5725->2192|5741->2198|5800->2235|5863->2270|5879->2276|5939->2314|6018->2365|6034->2371|6097->2412|6165->2452|6181->2458|6249->2504|6485->2712|6501->2718|6566->2761|6650->2817|6679->2824
                  LINES: 27->1|32->1|33->2|39->8|39->8|40->9|45->14|45->14|47->16|47->16|47->16|48->17|49->18|49->18|51->20|51->20|51->20|52->21|57->26|57->26|59->28|59->28|59->28|60->29|61->30|61->30|62->31|62->31|62->31|63->32|67->36|67->36|69->38|69->38|69->38|70->39|74->43|74->43|76->45|76->45|76->45|77->46|81->50|81->50|83->52|83->52|83->52|84->53|89->58|89->58|91->60|91->60|91->60|92->61|98->67|98->67|100->69|100->69|100->69|101->70|107->76|107->76|110->79|110->79|110->79|111->80|112->81|112->81|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|123->92|123->92|125->94|125->94|125->94|126->95|127->96|127->96|129->98|129->98|129->98|130->99|133->102|133->102|135->104|135->104|135->104|136->105|138->107|138->107|140->109|149->118|149->118|149->118|150->119|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|161->130|161->130|161->130|163->132|163->132
                  -- GENERATED --
              */
          