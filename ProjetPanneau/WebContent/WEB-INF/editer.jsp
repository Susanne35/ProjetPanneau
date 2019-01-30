<!-- Fait du fichier une jsp -->
<%@ page pageEncoding="UTF-8" %>
<!-- Code de type html 5 -->
<!DOCTYPE html>
<html>
<head>
<!-- Pour avoir les caractÃ¨res spÃ©ciaux bien affichÃ©s -->
<meta charset="UTF-8">
<!-- lien vers les feuilles de styles -->
<!-- taille écran 100% -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- lien vers les feuilles de styles -->
<link rel="stylesheet" href="/ProjetPanneau/theme/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/ProjetPanneau/theme/css/style.css">
<script src="/ProjetPanneau/theme/bootstrap/js/bootstrap.min.js"></script>
<title>Page Index</title>
</head>
<body>
<!-- Page type en Boostrap -->
<div class="jumbotron text-center">
  <h2>Panneau informatif de Suzeon City</h2>
  <p>Votre Panneau</p> 
</div>




<div class="container">
<!-- un enregistrement -->
  <div class="row">
  <div class="col-sm-3 col-xs-1">
       <!-- cellule vide pour mise en page -->
    </div>
    <div class="col-sm-6 col-xs-10">
      <h3 >Panneau en cours</h3>
      <p>Titre du panneau</p>
      <p>
      <%String variable = (String)request.getAttribute("variable");
      out.println(variable);%></p>     
	
	<div><a href="/ProjetPanneau/index.jsp" class="btn btn-info" role="button">Modifier</a></div>
	</div>
<div class="col-sm-3 col-xs-1">
       <!-- cellule vide pour mise en page -->
    </div>
  </div>
</div><!-- /.container -->
</body>
</html>