
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object AddRoomType_Scope0 {
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

class AddRoomType extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
       """),format.raw/*39.8*/("""background: #ccc;
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

    """),format.raw/*78.5*/("""#wrapper """),format.raw/*78.14*/("""{"""),format.raw/*78.15*/("""
      """),format.raw/*79.7*/("""overflow: hidden;
    """),format.raw/*80.5*/("""}"""),format.raw/*80.6*/("""

    """),format.raw/*82.5*/("""#content """),format.raw/*82.14*/("""{"""),format.raw/*82.15*/("""
      """),format.raw/*83.7*/("""margin-right: 230px; /* Same as 'nav' width */
    """),format.raw/*84.5*/("""}"""),format.raw/*84.6*/("""

    """),format.raw/*86.5*/(""".innertube """),format.raw/*86.16*/("""{"""),format.raw/*86.17*/("""
      """),format.raw/*87.7*/("""margin: 15px; /* Padding for content */
      margin-top: 0;
      background-color: #FFFFFF;
            text-color:#000000;
    """),format.raw/*91.5*/("""}"""),format.raw/*91.6*/("""

    """),format.raw/*93.5*/("""p """),format.raw/*93.7*/("""{"""),format.raw/*93.8*/("""
      """),format.raw/*94.7*/("""color: #555;
    """),format.raw/*95.5*/("""}"""),format.raw/*95.6*/("""

    """),format.raw/*97.5*/("""nav ul """),format.raw/*97.12*/("""{"""),format.raw/*97.13*/("""
      """),format.raw/*98.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
    """),format.raw/*101.5*/("""}"""),format.raw/*101.6*/("""

    """),format.raw/*103.5*/("""nav ul a """),format.raw/*103.14*/("""{"""),format.raw/*103.15*/("""
      """),format.raw/*104.7*/("""color: darkgreen;
      text-decoration: none;
    """),format.raw/*106.5*/("""}"""),format.raw/*106.6*/("""

    """),format.raw/*108.5*/("""</style>

  </head>

  <body>

<div align="center" >
<h1><a> Hotel Management System</a></h1>
</div>

<ul>
    <li><a class="active" href=""""),_display_(/*119.34*/routes/*119.40*/.RedirectionController.redirectHome()),format.raw/*119.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*120.19*/routes/*120.25*/.RedirectionController.redirectAdmin()),format.raw/*120.63*/("""">Admin</a></li>
    <li><a class="active" href=""""),_display_(/*121.34*/routes/*121.40*/.RedirectionController.redirectAdminWaiter()),format.raw/*121.84*/("""">Assign Waiter</a></li>
    <li><a href=""""),_display_(/*122.19*/routes/*122.25*/.RedirectionController.redirectAdminAddRoom()),format.raw/*122.70*/("""">Rooms</a></li>
    <li><a href=""""),_display_(/*123.19*/routes/*123.25*/.RedirectionController.redirectAdminAddRoomType()),format.raw/*123.74*/("""">Room Type</a></li>
      </ul>
      <br>
    <div id="wrapper">

      <main>
            <h1> Administrator </h1>
            <h2>Creation Of Room Type</h2>
            <p><script>generateText(20)</script></p>

            <form method = "POST" action =""""),_display_(/*133.45*/routes/*133.51*/.AdminRoomTypeController.createRoom()),format.raw/*133.88*/("""">
              <table>
                <tr>
                  <td>Room Type : </td>
                  <td><input type="text" name="roomType"><br></td>
                </tr>
                <tr>
                  <td>Price : </td>
                  <td><input type="text" name="price"><br></td>
                </tr>
                <tr>
                  <td>Number of beds : </td>
                  <td><input type="text" name="beds"><br></td>
                </tr>
                <tr>
                  <td>Smoking:</td>
                  <td>
                    <select name="smoking">
                      <option value="No">No</option>
                      <option value="Yes">Yes</option>


                    </select>
                  </td>
                </tr>
                <tr>
                  <td>WiFi:</td>
                  <td>
                    <select name="wifi">
                      <option value="No">No</option>
                      <option value="Yes">Yes</option>


                    </select>
                  </td>
                </tr>

              </table>
              <br>
              <br>
              <input type="submit" value="Submit" name="AddRoomType">
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
object AddRoomType extends AddRoomType_Scope0.AddRoomType
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:20:03 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/AddRoomType.scala.html
                  HASH: 59db9047ecd0225dc8ad8bcf834c170834e2a073
                  MATRIX: 839->2|1085->222|1112->223|1144->229|1280->338|1308->339|1339->343|1369->346|1397->347|1430->353|1471->367|1499->368|1530->372|1562->377|1590->378|1623->384|1764->498|1792->499|1823->503|1862->514|1891->515|1924->521|1976->546|2004->547|2037->553|2070->558|2099->559|2134->567|2253->659|2281->660|2316->668|2351->675|2380->676|2416->685|2574->816|2602->817|2637->825|2675->835|2704->836|2739->844|2894->972|2922->973|2957->981|2990->986|3019->987|3054->995|3235->1149|3263->1150|3298->1158|3329->1162|3358->1163|3393->1171|3576->1327|3604->1328|3639->1336|3674->1343|3703->1344|3738->1352|3914->1501|3942->1502|3977->1510|4014->1519|4043->1520|4078->1528|4128->1551|4156->1552|4191->1560|4228->1569|4257->1570|4292->1578|4371->1630|4399->1631|4434->1639|4473->1650|4502->1651|4537->1659|4698->1793|4726->1794|4761->1802|4790->1804|4818->1805|4853->1813|4898->1831|4926->1832|4961->1840|4996->1847|5025->1848|5060->1856|5153->1921|5182->1922|5218->1930|5256->1939|5286->1940|5322->1948|5403->2001|5432->2002|5468->2010|5647->2161|5663->2167|5722->2204|5785->2239|5801->2245|5861->2283|5940->2334|5956->2340|6022->2384|6094->2428|6110->2434|6177->2479|6241->2515|6257->2521|6328->2570|6625->2839|6641->2845|6700->2882
                  LINES: 32->2|38->8|38->8|39->9|44->14|44->14|46->16|46->16|46->16|47->17|48->18|48->18|50->20|50->20|50->20|51->21|56->26|56->26|58->28|58->28|58->28|59->29|60->30|60->30|61->31|61->31|61->31|62->32|66->36|66->36|68->38|68->38|68->38|69->39|73->43|73->43|75->45|75->45|75->45|76->46|80->50|80->50|82->52|82->52|82->52|83->53|88->58|88->58|90->60|90->60|90->60|91->61|97->67|97->67|99->69|99->69|99->69|100->70|106->76|106->76|108->78|108->78|108->78|109->79|110->80|110->80|112->82|112->82|112->82|113->83|114->84|114->84|116->86|116->86|116->86|117->87|121->91|121->91|123->93|123->93|123->93|124->94|125->95|125->95|127->97|127->97|127->97|128->98|131->101|131->101|133->103|133->103|133->103|134->104|136->106|136->106|138->108|149->119|149->119|149->119|150->120|150->120|150->120|151->121|151->121|151->121|152->122|152->122|152->122|153->123|153->123|153->123|163->133|163->133|163->133
                  -- GENERATED --
              */
          