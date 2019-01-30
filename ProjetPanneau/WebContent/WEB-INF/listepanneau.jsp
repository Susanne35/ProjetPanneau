<!-- Fait du fichier une jsp -->
<%@ page pageEncoding="UTF-8" %>
<!-- Code de type html 5 -->
<!DOCTYPE html>
<html>
<head>
<!-- Pour avoir les caractÃ¨res spÃ©ciaux bien affichÃ©s -->
<meta charset="UTF-8">
<!-- lien vers les feuilles de styles -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/ProjetPanneau/theme/bootstrap/css/bootstrap.min.css">

<script src="/ProjetPanneau/theme/bootstrap/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="/ProjetPanneau/theme/css/style.css">
<title>Page Index</title>
</head>
<body>
<!-- Page type en Boostrap -->
<div class="jumbotron text-center">
  <h2>Panneau informatif de Suzeon City</h2>
  <p>Historique des enregistrements</p> 
</div>

<div class="container">

  <div class="row">
  
  <!-- un enregistrement -->
    <div class="col-sm-4">
      <h3 >Panneau 8</h3>
      <p>Titre du panneau</p>
      <p><!-- List<Panneau> panneaux = new ArrayList<>();--></p>  
	<div><a href="/ProjetPanneau/index.jsp" class="btn btn-info" role="button">Modifier</a></div>
	</div>
 <!-- un enregistrement -->
    <div class="col-sm-4">
      <h3 >Panneau 7</h3>
      <p>Titre du panneau</p>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.     
	
	</div>
     <!-- un enregistrement -->
    <div class="col-sm-4">
      <h3 >Panneau 6</h3>
      <p>Titre du panneau</p>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.     
	</div>
		</div>
	<br><hr><br>
	<div class="row">
  
  <!-- un enregistrement -->
    <div class="col-sm-4">
      <h3 >Panneau 5</h3>
      <p>Titre du panneau</p>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.     
	
	</div>
 <!-- un enregistrement -->
    <div class="col-sm-4">
      <h3 >Panneau 4</h3>
      <p>Titre du panneau</p>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.     
	
	</div>
     <!-- un enregistrement -->
    <div class="col-sm-4">
      <h3 >Panneau 3</h3>
      <p>Titre du panneau</p>
      <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.     
	</div>
	
	
	

	</div>
	

    <!-- Pagination -->
  <div > <ul class="pagination pagination-sm">
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li> <!--  <li class="active"><a href="#">2</a></li> -->
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
  </ul></div>
  <!-- /.Pagination -->
  
</div><!-- /.container -->
</body>
</html>