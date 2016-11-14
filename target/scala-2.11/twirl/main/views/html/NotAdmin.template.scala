
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object NotAdmin_Scope0 {
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

class NotAdmin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

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
    ul """),format.raw/*8.8*/("""{"""),format.raw/*8.9*/("""
      """),format.raw/*9.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
      overflow: hidden;
      background-color: #333;
    """),format.raw/*14.5*/("""}"""),format.raw/*14.6*/("""

    """),format.raw/*16.5*/("""li """),format.raw/*16.8*/("""{"""),format.raw/*16.9*/("""
      """),format.raw/*17.7*/("""float: left;
    """),format.raw/*18.5*/("""}"""),format.raw/*18.6*/("""

    """),format.raw/*20.5*/("""li a """),format.raw/*20.10*/("""{"""),format.raw/*20.11*/("""
      """),format.raw/*21.7*/("""display: block;
      color: white;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
    """),format.raw/*26.5*/("""}"""),format.raw/*26.6*/("""

    """),format.raw/*28.5*/("""li a:hover """),format.raw/*28.16*/("""{"""),format.raw/*28.17*/("""
      """),format.raw/*29.7*/("""background-color: #111;
    """),format.raw/*30.5*/("""}"""),format.raw/*30.6*/("""
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
      <li><a class="active" href=""""),_display_(/*119.36*/routes/*119.42*/.RedirectionController.redirectHome()),format.raw/*119.79*/("""">Home</a></li>
      <li><a href=""""),_display_(/*120.21*/routes/*120.27*/.RedirectionController.redirectGuest()),format.raw/*120.65*/("""">Guest</a></li>
      <li><a href=""""),_display_(/*121.21*/routes/*121.27*/.RedirectionController.redirectAdmin()),format.raw/*121.65*/("""">Admin</a></li>
    </ul>

    <br>
    <ul>
      <li><a class="active" href=""""),_display_(/*126.36*/routes/*126.42*/.RedirectionController.redirectAdminWaiter()),format.raw/*126.86*/("""">Assign Waiter</a></li>
      <li><a href=""""),_display_(/*127.21*/routes/*127.27*/.RedirectionController.redirectAdminAddRoom()),format.raw/*127.72*/("""">Rooms</a></li>
      <li><a href=""""),_display_(/*128.21*/routes/*128.27*/.RedirectionController.redirectAdminAddRoomType()),format.raw/*128.76*/("""">Room Type</a></li>
    </ul>
    <br>

    <div id="wrapper">

      <main>

        <h1> Failed to get access </h1>
        <h2> You are not an admin. </h2>
        <p><script>generateText(20)</script></p>

        <form>

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
object NotAdmin extends NotAdmin_Scope0.NotAdmin
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 16:20:44 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/NotAdmin.scala.html
                  HASH: 311ad4b45d89742bfff6f409a5fb78c4e02206f4
                  MATRIX: 833->2|1083->226|1110->227|1144->235|1292->356|1320->357|1355->365|1385->368|1413->369|1448->377|1493->395|1521->396|1556->404|1589->409|1618->410|1653->418|1806->544|1834->545|1869->553|1908->564|1937->565|1972->573|2028->602|2056->603|2089->609|2122->614|2151->615|2186->623|2305->715|2333->716|2368->724|2403->731|2432->732|2467->740|2631->877|2659->878|2694->886|2732->896|2761->897|2796->905|2957->1039|2985->1040|3020->1048|3053->1053|3082->1054|3117->1062|3304->1222|3332->1223|3367->1231|3398->1235|3427->1236|3462->1244|3645->1400|3673->1401|3708->1409|3743->1416|3772->1417|3807->1425|3983->1574|4011->1575|4048->1585|4085->1594|4114->1595|4149->1603|4199->1626|4227->1627|4262->1635|4299->1644|4328->1645|4363->1653|4442->1705|4470->1706|4505->1714|4544->1725|4573->1726|4608->1734|4763->1862|4791->1863|4826->1871|4855->1873|4883->1874|4918->1882|4963->1900|4991->1901|5026->1909|5061->1916|5090->1917|5125->1925|5218->1990|5247->1991|5283->1999|5321->2008|5351->2009|5387->2017|5468->2070|5497->2071|5533->2079|5730->2248|5746->2254|5805->2291|5870->2328|5886->2334|5946->2372|6012->2410|6028->2416|6088->2454|6202->2540|6218->2546|6284->2590|6358->2636|6374->2642|6441->2687|6507->2725|6523->2731|6594->2780
                  LINES: 32->2|38->8|38->8|39->9|44->14|44->14|46->16|46->16|46->16|47->17|48->18|48->18|50->20|50->20|50->20|51->21|56->26|56->26|58->28|58->28|58->28|59->29|60->30|60->30|61->31|61->31|61->31|62->32|66->36|66->36|68->38|68->38|68->38|69->39|73->43|73->43|75->45|75->45|75->45|76->46|80->50|80->50|82->52|82->52|82->52|83->53|88->58|88->58|90->60|90->60|90->60|91->61|97->67|97->67|99->69|99->69|99->69|100->70|106->76|106->76|109->79|109->79|109->79|110->80|111->81|111->81|113->83|113->83|113->83|114->84|115->85|115->85|117->87|117->87|117->87|118->88|122->92|122->92|124->94|124->94|124->94|125->95|126->96|126->96|128->98|128->98|128->98|129->99|132->102|132->102|134->104|134->104|134->104|135->105|137->107|137->107|139->109|149->119|149->119|149->119|150->120|150->120|150->120|151->121|151->121|151->121|156->126|156->126|156->126|157->127|157->127|157->127|158->128|158->128|158->128
                  -- GENERATED --
              */
          