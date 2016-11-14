
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object AdminAddRoom_Scope0 {
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

class AdminAddRoom extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Set[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(roomTypeVals : Set[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title><!DOCTYPE html>
    <html>
      <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>2 Column Layout &mdash; Right Menu with Header &amp; Footer</title>
        <style type="text/css">
        ul """),format.raw/*12.12*/("""{"""),format.raw/*12.13*/("""
            """),format.raw/*13.13*/("""list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
            background-color: #333;
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/("""

        """),format.raw/*20.9*/("""li """),format.raw/*20.12*/("""{"""),format.raw/*20.13*/("""
            """),format.raw/*21.13*/("""float: left;
        """),format.raw/*22.9*/("""}"""),format.raw/*22.10*/("""

        """),format.raw/*24.9*/("""li a """),format.raw/*24.14*/("""{"""),format.raw/*24.15*/("""
            """),format.raw/*25.13*/("""display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/("""

        """),format.raw/*32.9*/("""li a:hover """),format.raw/*32.20*/("""{"""),format.raw/*32.21*/("""
            """),format.raw/*33.13*/("""background-color: #111;
        """),format.raw/*34.9*/("""}"""),format.raw/*34.10*/("""
        """),format.raw/*35.9*/("""body """),format.raw/*35.14*/("""{"""),format.raw/*35.15*/("""
            """),format.raw/*36.13*/("""margin:0;
            padding:0;
            font-family: Sans-Serif;
            line-height: 1.5em;
        """),format.raw/*40.9*/("""}"""),format.raw/*40.10*/("""

"""),format.raw/*42.1*/("""header """),format.raw/*42.8*/("""{"""),format.raw/*42.9*/("""
    """),format.raw/*43.5*/("""background: #ccc;
    height: 100px;
    background-color: #00008B;
    background-image: url("/assets/images/hotel.jpg");
"""),format.raw/*47.1*/("""}"""),format.raw/*47.2*/("""

"""),format.raw/*49.1*/("""header h1 """),format.raw/*49.11*/("""{"""),format.raw/*49.12*/("""
    """),format.raw/*50.5*/("""margin: 0;
    padding-top: 15px;
    background-color: #00008B;
    background-image: url("/assets/images/hotel.jpg");
"""),format.raw/*54.1*/("""}"""),format.raw/*54.2*/("""

"""),format.raw/*56.1*/("""main """),format.raw/*56.6*/("""{"""),format.raw/*56.7*/("""
    """),format.raw/*57.5*/("""padding-bottom: 10010px;
    margin-bottom: -10000px;
    float: left;
    width: 100%;
    background-image: url("/assets/images/hotel.jpg");
"""),format.raw/*62.1*/("""}"""),format.raw/*62.2*/("""

    """),format.raw/*64.5*/("""nav """),format.raw/*64.9*/("""{"""),format.raw/*64.10*/("""
      """),format.raw/*65.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 230px;
      margin-left: -230px;
      background: #eee;
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""

    """),format.raw/*73.5*/("""footer """),format.raw/*73.12*/("""{"""),format.raw/*73.13*/("""
      """),format.raw/*74.7*/("""clear: left;
      width: 100%;
      text-align: center;
      padding: 4px 0;
      background-color: #FFFFFF;
      text-color:#000000;
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/("""


    """),format.raw/*83.5*/("""#wrapper """),format.raw/*83.14*/("""{"""),format.raw/*83.15*/("""
      """),format.raw/*84.7*/("""overflow: hidden;
    """),format.raw/*85.5*/("""}"""),format.raw/*85.6*/("""

    """),format.raw/*87.5*/("""#content """),format.raw/*87.14*/("""{"""),format.raw/*87.15*/("""
      """),format.raw/*88.7*/("""margin-right: 230px; /* Same as 'nav' width */
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/("""

    """),format.raw/*91.5*/(""".innertube """),format.raw/*91.16*/("""{"""),format.raw/*91.17*/("""
      """),format.raw/*92.7*/("""margin: 15px; /* Padding for content */
      margin-top: 0;
      background-color: #FFFFFF;
            text-color:#000000;
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/("""

    """),format.raw/*98.5*/("""p """),format.raw/*98.7*/("""{"""),format.raw/*98.8*/("""
      """),format.raw/*99.7*/("""color: #555;
    """),format.raw/*100.5*/("""}"""),format.raw/*100.6*/("""

    """),format.raw/*102.5*/("""nav ul """),format.raw/*102.12*/("""{"""),format.raw/*102.13*/("""
      """),format.raw/*103.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
    """),format.raw/*106.5*/("""}"""),format.raw/*106.6*/("""

    """),format.raw/*108.5*/("""nav ul a """),format.raw/*108.14*/("""{"""),format.raw/*108.15*/("""
      """),format.raw/*109.7*/("""color: darkgreen;
      text-decoration: none;
    """),format.raw/*111.5*/("""}"""),format.raw/*111.6*/("""

    """),format.raw/*113.5*/("""</style>

      </head>

<body>
    <div align="center" >
        <h1><a> Hotel Management System</a></h1>
    </div>
<ul>
    <li><a class="active" href=""""),_display_(/*122.34*/routes/*122.40*/.RedirectionController.redirectHome()),format.raw/*122.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*123.19*/routes/*123.25*/.RedirectionController.redirectAdmin()),format.raw/*123.63*/("""">Admin</a></li>
    <li><a class="active" href=""""),_display_(/*124.34*/routes/*124.40*/.RedirectionController.redirectAdminWaiter()),format.raw/*124.84*/("""">Assign Waiter</a></li>
    <li><a href=""""),_display_(/*125.19*/routes/*125.25*/.RedirectionController.redirectAdminAddRoom()),format.raw/*125.70*/("""">Rooms</a></li>
    <li><a href=""""),_display_(/*126.19*/routes/*126.25*/.RedirectionController.redirectAdminAddRoomType()),format.raw/*126.74*/("""">Room Type</a></li>
    </ul>
    <br>
  <div id="wrapper">

    <main>

          <h1> Administrator </h1>
          <h2>Add a Room</h2>
          <p><script>generateText(20)</script></p>

          <form method="POST" action=""""),_display_(/*137.40*/routes/*137.46*/.AdminRoomController.createRoom()),format.raw/*137.79*/("""">
            <table>

              <tr>
                <td>Room Type:</td>
                <td>
                  <select name="roomType">
                    """),_display_(/*144.22*/for(roomType <- roomTypeVals) yield /*144.51*/ {_display_(Seq[Any](format.raw/*144.53*/("""
                      """),format.raw/*145.23*/("""<option value=""""),_display_(/*145.39*/roomType),format.raw/*145.47*/("""">"""),_display_(/*145.50*/roomType),format.raw/*145.58*/("""</option>
                    """)))}),format.raw/*146.22*/("""
                  """),format.raw/*147.19*/("""</select>
                </td>
              </tr>
              <tr>
                <td>Room Phone Number :</td>
                <td><input type="text" name="roomPhoneNumber"></td>
              </tr>

            </table>
            <table>
              <tr><td><input type="submit" value="Create Room" name="CreateRoom"></td></tr>
            </table>
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
      Project Members : Sujeet Kulkarni, Chen Chen Jiahao Xu, Divya Marneni, Lovina Dmello
    </div>
  </footer>

</body>
</html>

"""))
      }
    }
  }

  def render(roomTypeVals:Set[String]): play.twirl.api.HtmlFormat.Appendable = apply(roomTypeVals)

  def f:((Set[String]) => play.twirl.api.HtmlFormat.Appendable) = (roomTypeVals) => apply(roomTypeVals)

  def ref: this.type = this

}


}

/**/
object AdminAddRoom extends AdminAddRoom_Scope0.AdminAddRoom
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:20:03 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/AdminAddRoom.scala.html
                  HASH: eb389e3e334cff8481de93b42a809e1de0573a76
                  MATRIX: 764->1|887->29|915->31|1269->357|1298->358|1340->372|1516->521|1545->522|1584->534|1615->537|1644->538|1686->552|1735->574|1764->575|1803->587|1836->592|1865->593|1907->607|2088->761|2117->762|2156->774|2195->785|2224->786|2266->800|2326->833|2355->834|2392->844|2425->849|2454->850|2496->864|2637->978|2666->979|2697->983|2731->990|2759->991|2792->997|2946->1124|2974->1125|3005->1129|3043->1139|3072->1140|3105->1146|3256->1270|3284->1271|3315->1275|3347->1280|3375->1281|3408->1287|3583->1435|3611->1436|3646->1444|3677->1448|3706->1449|3741->1457|3924->1613|3952->1614|3987->1622|4022->1629|4051->1630|4086->1638|4262->1787|4290->1788|4327->1798|4364->1807|4393->1808|4428->1816|4478->1839|4506->1840|4541->1848|4578->1857|4607->1858|4642->1866|4721->1918|4749->1919|4784->1927|4823->1938|4852->1939|4887->1947|5048->2081|5076->2082|5111->2090|5140->2092|5168->2093|5203->2101|5249->2119|5278->2120|5314->2128|5350->2135|5380->2136|5416->2144|5509->2209|5538->2210|5574->2218|5612->2227|5642->2228|5678->2236|5759->2289|5788->2290|5824->2298|6017->2463|6033->2469|6092->2506|6155->2541|6171->2547|6231->2585|6310->2636|6326->2642|6392->2686|6464->2730|6480->2736|6547->2781|6611->2817|6627->2823|6698->2872|6967->3113|6983->3119|7038->3152|7237->3323|7283->3352|7324->3354|7377->3378|7421->3394|7451->3402|7482->3405|7512->3413|7576->3445|7625->3465
                  LINES: 27->1|32->1|33->2|43->12|43->12|44->13|49->18|49->18|51->20|51->20|51->20|52->21|53->22|53->22|55->24|55->24|55->24|56->25|61->30|61->30|63->32|63->32|63->32|64->33|65->34|65->34|66->35|66->35|66->35|67->36|71->40|71->40|73->42|73->42|73->42|74->43|78->47|78->47|80->49|80->49|80->49|81->50|85->54|85->54|87->56|87->56|87->56|88->57|93->62|93->62|95->64|95->64|95->64|96->65|102->71|102->71|104->73|104->73|104->73|105->74|111->80|111->80|114->83|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|119->88|120->89|120->89|122->91|122->91|122->91|123->92|127->96|127->96|129->98|129->98|129->98|130->99|131->100|131->100|133->102|133->102|133->102|134->103|137->106|137->106|139->108|139->108|139->108|140->109|142->111|142->111|144->113|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126|168->137|168->137|168->137|175->144|175->144|175->144|176->145|176->145|176->145|176->145|176->145|177->146|178->147
                  -- GENERATED --
              */
          