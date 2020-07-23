<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="Dashboard">
  <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
  <title></title>

  <!-- Favicons -->
  <link href="<c:url value="resources/img/favicon.png"/>" rel="icon">
  <link href="<c:url value="resources/img/apple-touch-icon.png"/>" rel="apple-touch-icon">

  <!-- Bootstrap core CSS -->
  <link href="<c:url value="resources/lib/bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">
  <!--external css-->
  <link href="<c:url value="resources/lib/font-awesome/css/font-awesome.css"/>" rel="stylesheet" />
  <!-- Custom styles for this template -->
  <link href="<c:url value="resources/css/style.css"/>" rel="stylesheet">
  <link href="<c:url value="resources/css/style-responsive.css"/>" rel="stylesheet">
  
  <!-- =======================================================
    Template Name: Dashio
    Template URL: https://templatemag.com/dashio-bootstrap-admin-template/
    Author: TemplateMag.com
    License: https://templatemag.com/license/
  ======================================================= -->
</head>

<body>
  <section id="container">
    
    <!--main content start-->
    <section id="main-content">
      <section class="wrapper">
        <div class="row mt">
          <div class="col-md-11">
            <div class="content-panel">
              <table class="table table-striped table-advance table-hover">
               <ul class="nav pull-right top-menu">
                <li>
                  <a class="primary" href="sorted.htm">Sorted</a>
                </li>
               </ul>
                <h4><i class="fa fa-angle-right"></i>Corona virus</h4>
                
                <hr>
                <thead>
                  <tr>
                    <th style="background-color:whitesmoke; text-align: center">
                    <a  style="color: black">Villes</a>
                    </th>
                    <th style="background-color:#bb34cf; text-align: center">
                      <a  style="color: white">Confirmes</a>
                    </th>
                     <th style="background-color:#ff0544; text-align: center">
                      <a  style="color: white">
                        En traitements
                        </a>
                    </th>
                     <th style="background-color:#07483c;text-align: center">
                      <a  style="color: white">
                        Gueris
                        </a>
                    </th>
                    <th style="background-color:#353636;text-align: center">
                      <a  style="color : white">
                        Formes graves
                        </a>
                    </th>
                     <th style="background-color:#010001;text-align: center">
                        <a  style="color: white">Deces</a>
                    </th>
                  </tr>
                </thead>
                <tbody>
                 <c:forEach var="cas2" items="${message}">
                  <tr>
                    <td style="text-align: center">
                      <a  >${cas2.getVille()}</a>
                    </td>
                    <td class="hidden-phone" style="text-align: center">${cas2.getNouveau_cas()}</td>
                    <td style="text-align: center">${cas2.getEntraitement()}</td>
                    <td style="text-align: center">${cas2.getNombre_geuris()}</td>
                    <td style="text-align: center">${cas2.getForme_grave()}</td>
                    <td style="text-align: center">${cas2.getNombre_deces()}</td>
                    
                  </tr>
                 </c:forEach>
                </tbody>
              </table>
            </div>
            <!-- /content-panel -->
          </div>
          <!-- /col-md-12 -->
        </div>
        <!-- /row -->
      </section>
    </section>
  </section>
  <!-- js placed at the end of the document so the pages load faster -->
  <script src="<c:url value="resources/lib/jquery/jquery.min.js"/>"></script>
      <script src="<c:url value="resources/lib/bootstrap/js/bootstrap.min.js"/>"></script>
      <script class="include" type="text/javascript" src="<c:url value="resources/lib/jquery.dcjqaccordion.2.7.js"/>"></script>
      <script src="<c:url value="resources/lib/jquery.scrollTo.min.js"/>"></script>
      <script src="<c:url value="resources/lib/jquery.nicescroll.js"/>" type="text/javascript"></script>
  <!--common script for all pages-->
      <script src="<c:url value="resources/lib/common-scripts.js"/>"></script>
  <!--script for this page-->
  
</body>

</html>

