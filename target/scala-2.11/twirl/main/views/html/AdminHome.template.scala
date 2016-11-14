
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object AdminHome_Scope0 {
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

class AdminHome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
ul """),format.raw/*7.4*/("""{"""),format.raw/*7.5*/("""
    """),format.raw/*8.5*/("""list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
"""),format.raw/*13.1*/("""}"""),format.raw/*13.2*/("""

"""),format.raw/*15.1*/("""li """),format.raw/*15.4*/("""{"""),format.raw/*15.5*/("""
    """),format.raw/*16.5*/("""float: left;
"""),format.raw/*17.1*/("""}"""),format.raw/*17.2*/("""

"""),format.raw/*19.1*/("""li a """),format.raw/*19.6*/("""{"""),format.raw/*19.7*/("""
    """),format.raw/*20.5*/("""display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/("""

"""),format.raw/*27.1*/("""li a:hover """),format.raw/*27.12*/("""{"""),format.raw/*27.13*/("""
    """),format.raw/*28.5*/("""background-color: #111;
"""),format.raw/*29.1*/("""}"""),format.raw/*29.2*/("""
    """),format.raw/*30.5*/("""body """),format.raw/*30.10*/("""{"""),format.raw/*30.11*/("""
      """),format.raw/*31.7*/("""margin:0;
      padding:0;
      font-family: Sans-Serif;
      line-height: 1.5em;
    """),format.raw/*35.5*/("""}"""),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""header """),format.raw/*37.12*/("""{"""),format.raw/*37.13*/("""
      """),format.raw/*38.7*/("""background: #ccc;
      height: 100px;
      background-color: #00008B;
background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*42.5*/("""}"""),format.raw/*42.6*/("""

    """),format.raw/*44.5*/("""header h1 """),format.raw/*44.15*/("""{"""),format.raw/*44.16*/("""
      """),format.raw/*45.7*/("""margin: 0;
      padding-top: 15px;
      background-color: #00008B;
background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*49.5*/("""}"""),format.raw/*49.6*/("""

    """),format.raw/*51.5*/("""main """),format.raw/*51.10*/("""{"""),format.raw/*51.11*/("""
      """),format.raw/*52.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 100%;
      background-image: url("/assets/images/hotel.jpg");
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""

    """),format.raw/*59.5*/("""nav """),format.raw/*59.9*/("""{"""),format.raw/*59.10*/("""
      """),format.raw/*60.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 230px;
      margin-left: -230px;
      background: #eee;
    """),format.raw/*66.5*/("""}"""),format.raw/*66.6*/("""

    """),format.raw/*68.5*/("""footer """),format.raw/*68.12*/("""{"""),format.raw/*68.13*/("""
      """),format.raw/*69.7*/("""clear: left;
      width: 100%;
      text-align: center;
      padding: 4px 0;
      background-color: #FFFFFF;
      text-color:#000000;
    """),format.raw/*75.5*/("""}"""),format.raw/*75.6*/("""


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
    <li><a class="active" href=""""),_display_(/*118.34*/routes/*118.40*/.RedirectionController.redirectHome()),format.raw/*118.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*119.19*/routes/*119.25*/.RedirectionController.redirectAdmin()),format.raw/*119.63*/("""">Admin</a></li>
    <li><a class="active" href=""""),_display_(/*120.34*/routes/*120.40*/.RedirectionController.redirectAdminWaiter()),format.raw/*120.84*/("""">Assign Waiter</a></li>
    <li><a href=""""),_display_(/*121.19*/routes/*121.25*/.RedirectionController.redirectAdminAddRoom()),format.raw/*121.70*/("""">Rooms</a></li>
    <li><a href=""""),_display_(/*122.19*/routes/*122.25*/.RedirectionController.redirectAdminAddRoomType()),format.raw/*122.74*/("""">Room Type</a></li>

</ul>






    <div id="wrapper">

      <main>
            <h1> Administrator </h1>
            <p><script>generateText(20)</script></p>

            <form method="POST" action=""""),_display_(/*137.42*/routes/*137.48*/.AdminHomeController.adminRedirect()),format.raw/*137.84*/("""">

              <br>
              <input type="submit" name="waiter" value="Assign Waiter" width="80" height="80">
              <br>
              <br>
              <br><input type="submit" name="room" value="Room Details">
              <br>
              <br>
              <br><input type="submit" name="roomType" value="Types of Rooms">
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
object AdminHome extends AdminHome_Scope0.AdminHome
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:20:03 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/AdminHome.scala.html
                  HASH: f00e0ca9db435a7170afa00b0946ac1a14489f25
                  MATRIX: 835->0|1081->220|1108->221|1140->227|1276->336|1304->337|1335->341|1365->344|1393->345|1426->351|1467->365|1495->366|1526->370|1558->375|1586->376|1619->382|1760->496|1788->497|1819->501|1858->512|1887->513|1920->519|1972->544|2000->545|2033->551|2066->556|2095->557|2130->565|2249->657|2277->658|2312->666|2347->673|2376->674|2411->682|2569->813|2597->814|2632->822|2670->832|2699->833|2734->841|2889->969|2917->970|2952->978|2985->983|3014->984|3049->992|3236->1152|3264->1153|3299->1161|3330->1165|3359->1166|3394->1174|3577->1330|3605->1331|3640->1339|3675->1346|3704->1347|3739->1355|3915->1504|3943->1505|3980->1515|4017->1524|4046->1525|4081->1533|4131->1556|4159->1557|4194->1565|4231->1574|4260->1575|4295->1583|4374->1635|4402->1636|4437->1644|4476->1655|4505->1656|4540->1664|4701->1798|4729->1799|4764->1807|4793->1809|4821->1810|4856->1818|4901->1836|4929->1837|4964->1845|4999->1852|5028->1853|5063->1861|5156->1926|5185->1927|5221->1935|5259->1944|5289->1945|5325->1953|5406->2006|5435->2007|5471->2015|5648->2164|5664->2170|5723->2207|5786->2242|5802->2248|5862->2286|5941->2337|5957->2343|6023->2387|6095->2431|6111->2437|6178->2482|6242->2518|6258->2524|6329->2573|6575->2791|6591->2797|6649->2833
                  LINES: 32->1|38->7|38->7|39->8|44->13|44->13|46->15|46->15|46->15|47->16|48->17|48->17|50->19|50->19|50->19|51->20|56->25|56->25|58->27|58->27|58->27|59->28|60->29|60->29|61->30|61->30|61->30|62->31|66->35|66->35|68->37|68->37|68->37|69->38|73->42|73->42|75->44|75->44|75->44|76->45|80->49|80->49|82->51|82->51|82->51|83->52|88->57|88->57|90->59|90->59|90->59|91->60|97->66|97->66|99->68|99->68|99->68|100->69|106->75|106->75|109->78|109->78|109->78|110->79|111->80|111->80|113->82|113->82|113->82|114->83|115->84|115->84|117->86|117->86|117->86|118->87|122->91|122->91|124->93|124->93|124->93|125->94|126->95|126->95|128->97|128->97|128->97|129->98|132->101|132->101|134->103|134->103|134->103|135->104|137->106|137->106|139->108|149->118|149->118|149->118|150->119|150->119|150->119|151->120|151->120|151->120|152->121|152->121|152->121|153->122|153->122|153->122|168->137|168->137|168->137
                  -- GENERATED --
              */
          