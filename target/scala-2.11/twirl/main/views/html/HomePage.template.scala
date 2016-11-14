
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object HomePage_Scope0 {
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

class HomePage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""﻿<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2 Column Layout — Right Menu with Header &amp; Footer</title>
    <style type="text/css">
    ul """),format.raw/*6.8*/("""{"""),format.raw/*6.9*/("""
        """),format.raw/*7.9*/("""list-style-type: none;
        margin: 0;
        padding: 0;
        overflow: hidden;
        background-color: #333;
    """),format.raw/*12.5*/("""}"""),format.raw/*12.6*/("""

    """),format.raw/*14.5*/("""li """),format.raw/*14.8*/("""{"""),format.raw/*14.9*/("""
        """),format.raw/*15.9*/("""float: left;
    """),format.raw/*16.5*/("""}"""),format.raw/*16.6*/("""

    """),format.raw/*18.5*/("""li a """),format.raw/*18.10*/("""{"""),format.raw/*18.11*/("""
        """),format.raw/*19.9*/("""display: block;
        color: white;
        text-align: center;
        padding: 14px 16px;
        text-decoration: none;
    """),format.raw/*24.5*/("""}"""),format.raw/*24.6*/("""

    """),format.raw/*26.5*/("""li a:hover """),format.raw/*26.16*/("""{"""),format.raw/*26.17*/("""
        """),format.raw/*27.9*/("""background-color: #111;
    """),format.raw/*28.5*/("""}"""),format.raw/*28.6*/("""
    """),format.raw/*29.5*/("""body """),format.raw/*29.10*/("""{"""),format.raw/*29.11*/("""
        """),format.raw/*30.9*/("""margin:0;
        padding:0;
        font-family: Sans-Serif;
        line-height: 1.5em;
    """),format.raw/*34.5*/("""}"""),format.raw/*34.6*/("""

"""),format.raw/*36.1*/("""header """),format.raw/*36.8*/("""{"""),format.raw/*36.9*/("""
    """),format.raw/*37.5*/("""background: #ccc;
    height: 100px;
    background-color: #00008B;
    background-image: url("/assets/images/hotel.jpg");
"""),format.raw/*41.1*/("""}"""),format.raw/*41.2*/("""

"""),format.raw/*43.1*/("""header h1 """),format.raw/*43.11*/("""{"""),format.raw/*43.12*/("""
    """),format.raw/*44.5*/("""margin: 0;
    padding-top: 15px;
    background-color: #00008B;
    background-image: url("/assets/images/hotel.jpg");
"""),format.raw/*48.1*/("""}"""),format.raw/*48.2*/("""

"""),format.raw/*50.1*/("""main """),format.raw/*50.6*/("""{"""),format.raw/*50.7*/("""
    """),format.raw/*51.5*/("""padding-bottom: 10010px;
    margin-bottom: -10000px;
    float: left;
    width: 100%;
    background-image: url("/assets/images/hotel.jpg");
"""),format.raw/*56.1*/("""}"""),format.raw/*56.2*/("""
    """),format.raw/*57.5*/("""nav """),format.raw/*57.9*/("""{"""),format.raw/*57.10*/("""
      """),format.raw/*58.7*/("""padding-bottom: 10010px;
      margin-bottom: -10000px;
      float: left;
      width: 230px;
      margin-left: -230px;
      background: #eee;
    """),format.raw/*64.5*/("""}"""),format.raw/*64.6*/("""

    """),format.raw/*66.5*/("""footer """),format.raw/*66.12*/("""{"""),format.raw/*66.13*/("""
      """),format.raw/*67.7*/("""clear: left;
      width: 100%;
      text-align: center;
      padding: 4px 0;
      background-color: #FFFFFF;
      text-color:#000000;
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/("""


    """),format.raw/*76.5*/("""#wrapper """),format.raw/*76.14*/("""{"""),format.raw/*76.15*/("""
      """),format.raw/*77.7*/("""overflow: hidden;
    """),format.raw/*78.5*/("""}"""),format.raw/*78.6*/("""

    """),format.raw/*80.5*/("""#content """),format.raw/*80.14*/("""{"""),format.raw/*80.15*/("""
      """),format.raw/*81.7*/("""margin-right: 230px; /* Same as 'nav' width */
    """),format.raw/*82.5*/("""}"""),format.raw/*82.6*/("""

    """),format.raw/*84.5*/(""".innertube """),format.raw/*84.16*/("""{"""),format.raw/*84.17*/("""
      """),format.raw/*85.7*/("""margin: 15px; /* Padding for content */
      margin-top: 0;
      background-color: #FFFFFF;
            text-color:#000000;
    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/("""

    """),format.raw/*91.5*/("""p """),format.raw/*91.7*/("""{"""),format.raw/*91.8*/("""
      """),format.raw/*92.7*/("""color: #555;
    """),format.raw/*93.5*/("""}"""),format.raw/*93.6*/("""

    """),format.raw/*95.5*/("""nav ul """),format.raw/*95.12*/("""{"""),format.raw/*95.13*/("""
      """),format.raw/*96.7*/("""list-style-type: none;
      margin: 0;
      padding: 0;
    """),format.raw/*99.5*/("""}"""),format.raw/*99.6*/("""

    """),format.raw/*101.5*/("""nav ul a """),format.raw/*101.14*/("""{"""),format.raw/*101.15*/("""
      """),format.raw/*102.7*/("""color: darkgreen;
      text-decoration: none;
    """),format.raw/*104.5*/("""}"""),format.raw/*104.6*/("""

    """),format.raw/*106.5*/("""</style>
    </head>
    <body>

        <div align="center" >
            <h1><a> Hotel Management System</a></h1>
        </div>


<ul>
    <li><a class="active" href=""""),_display_(/*116.34*/routes/*116.40*/.RedirectionController.redirectHome()),format.raw/*116.77*/("""">Home</a></li>
    <li><a href=""""),_display_(/*117.19*/routes/*117.25*/.RedirectionController.redirectGuest()),format.raw/*117.63*/("""">Guest</a></li>





</ul>
        <div id="wrapper">
            <main>
                        <h2>Enter Guest Id if you already have one. </h2>
                       
                        <form method="POST" action=""""),_display_(/*128.54*/routes/*128.60*/.GuestPreferences.GuestPreferenceRedirect()),format.raw/*128.103*/("""">
<table>
<tr>
<td>Enter Guest Id:</td>
<td><input type="text" name="txtGuestId"></td>
<td><input type="submit" name="guestIdSubmit" value ="Submit"></td>
</tr>
</table>
</form>
                <br>
                <br>
                <br>
                <br>


<h2>Enter Guest Details </h2>

<form method="POST"action=""""),_display_(/*145.29*/routes/*145.35*/.HomeController.formData()),format.raw/*145.61*/("""">
<table>
<tr>
<td><b>Name:</b></td>
<td><b><input name="Name" type="text"></b></td>
</tr>
<tr>
<td><b>Gender : </b></td>
<td><b><input name="gender" value="M" checked="checked"
                            type="radio"> Male<br>
                            <input name="gender" value="F" type="radio"> Female </b></td>
</tr>
<tr>
<td><b>Age :</b></td>
<td><b><input name="age" type="text"> </b></td>
</tr>
<tr>
<td><b>Address :</b></td>
<td><b><input name="address" type="Address"> </b></td>
</tr>
<tr>
<td><b>State :</b></td>
<td><b><select name="state" type="State">
                                <b><option value="Alabama">Alabama</option>
                                <option value="Alaska">Alaska</option>
                                <option value="Arizona">Arizona</option>
                                <option value="Arkansas">Arkansas</option>
                                <option value="California">California</option>
                                <option value="Colorado">Colorado</option>
                                <option value="Connecticut">Connecticut</option>
                                <option value="Delaware">Delaware</option>
                                <option value="Florida">Florida</option>
                                <option value="Georgia">Georgia</option>
                                <option value="Hawaii">Hawaii</option>
                                <option value="Idaho">Idaho</option>
                                <option value="Illinois">Illinois</option>
                                <option value="Indiana">Indiana</option>
                                <option value="Iowa">Iowa</option>
                                <option value="Kansas">Kansas</option>
                                <option value="Kentucky">Kentucky</option>
                                <option value="Louisiana">Louisiana</option>
                                <option value="Maine">Maine</option>
                                <option value="Michigan">Michigan</option>
                                <option value="Mississippi">Mississippi</option>
                                <option value="Montana">Montana</option>
                                <option value="Nebraska">Nebraska</option>
                                <option value="Nevada">Nevada</option>
                                <option value="New Jersey">New Jersey</option>
                                <option value="North Carolina">North Carolina</option>
                                <option value="South Carolina">South Carolina</option>
                                <option value="Wyoming">Wyoming</option></b>

</select></b></td>
</tr>
</table>
<br>
<br>
                            <input name="actionEvent" value="Submit" type="submit">
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


    </body></html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object HomePage extends HomePage_Scope0.HomePage
              /*
                  -- GENERATED --
                  DATE: Tue Jul 26 20:29:37 EDT 2016
                  SOURCE: C:/Users/marne/HotelManagementApplication/app/views/HomePage.scala.html
                  HASH: be02bb5c99e825d02f4ab0513bd5ef4e1f08ac20
                  MATRIX: 833->0|1071->212|1098->213|1134->223|1290->352|1318->353|1353->361|1383->364|1411->365|1448->375|1493->393|1521->394|1556->402|1589->407|1618->408|1655->418|1816->552|1844->553|1879->561|1918->572|1947->573|1984->583|2040->612|2068->613|2101->619|2134->624|2163->625|2200->635|2325->733|2353->734|2384->738|2418->745|2446->746|2479->752|2633->879|2661->880|2692->884|2730->894|2759->895|2792->901|2943->1025|2971->1026|3002->1030|3034->1035|3062->1036|3095->1042|3270->1190|3298->1191|3331->1197|3362->1201|3391->1202|3426->1210|3609->1366|3637->1367|3672->1375|3707->1382|3736->1383|3771->1391|3947->1540|3975->1541|4012->1551|4049->1560|4078->1561|4113->1569|4163->1592|4191->1593|4226->1601|4263->1610|4292->1611|4327->1619|4406->1671|4434->1672|4469->1680|4508->1691|4537->1692|4572->1700|4733->1834|4761->1835|4796->1843|4825->1845|4853->1846|4888->1854|4933->1872|4961->1873|4996->1881|5031->1888|5060->1889|5095->1897|5187->1962|5215->1963|5251->1971|5289->1980|5319->1981|5355->1989|5436->2042|5465->2043|5501->2051|5710->2232|5726->2238|5785->2275|5848->2310|5864->2316|5924->2354|6188->2590|6204->2596|6270->2639|6639->2980|6655->2986|6703->3012
                  LINES: 32->1|37->6|37->6|38->7|43->12|43->12|45->14|45->14|45->14|46->15|47->16|47->16|49->18|49->18|49->18|50->19|55->24|55->24|57->26|57->26|57->26|58->27|59->28|59->28|60->29|60->29|60->29|61->30|65->34|65->34|67->36|67->36|67->36|68->37|72->41|72->41|74->43|74->43|74->43|75->44|79->48|79->48|81->50|81->50|81->50|82->51|87->56|87->56|88->57|88->57|88->57|89->58|95->64|95->64|97->66|97->66|97->66|98->67|104->73|104->73|107->76|107->76|107->76|108->77|109->78|109->78|111->80|111->80|111->80|112->81|113->82|113->82|115->84|115->84|115->84|116->85|120->89|120->89|122->91|122->91|122->91|123->92|124->93|124->93|126->95|126->95|126->95|127->96|130->99|130->99|132->101|132->101|132->101|133->102|135->104|135->104|137->106|147->116|147->116|147->116|148->117|148->117|148->117|159->128|159->128|159->128|176->145|176->145|176->145
                  -- GENERATED --
              */
          