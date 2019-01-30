<!-- Fait du fichier une jsp -->
<%@ page pageEncoding="UTF-8" %>
<!-- Code de type html 5 -->
<!DOCTYPE html>
<html>
<head>
<!-- Pour avoir les caractères spéciaux bien affichÃ©s -->
<meta charset="UTF-8">
<!-- lien vers les feuilles de styles -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/ProjetPanneau/theme/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/ProjetPanneau/theme/css/style.css">
<script src="/ProjetPanneau/theme/bootstrap/js/bootstrap.min.js"></script>

<title>Page Index</title>
</head>
<body>
<!-- Page type en Boostrap -->
<div class="jumbotron text-center">
  <h2>Panneau informatif de Suzeon City</h2>
  <p>Gestion de panneau d'affichage urbain</p> 
</div>



<div class="container">
<!-- Balise permettant d'appeler la mehtode post -->
<form method="post" action="/ProjetPanneau/ServletIndex">
<!-- Contient titre et habitants -->
 <div class="row">
    <div class="col-sm-2 col-xs-1">
      <!-- cellule vide pour mise en page -->
    </div>
    <div class="col-sm-8 col-xs-10">
     <div class="form-group">
  <label for="focusedInput">Titre:</label>
  <input type="text" class="form-control" id="focusedInput" name="titre">
</div>
<div class="form-group">
  <label for="NbH">Nombre d'habitants:</label>
  <input type="number" class="form-control" id="NbH" name="nbhabitants" placeholder="">
</div>
    </div>
    <div class="col-sm-2 col-xs-1">
     <!-- cellule vide pour mise en page -->
    </div>
  </div>
<!-- Contient texte -->
  <div class="row">
    <div class="col-sm-2 col-xs-1">
       <!-- cellule vide pour mise en page -->
    </div>
    <div class="col-sm-8 col-xs-10">
      <div class="form-group">
  <label for="comment">Texte:</label>
  <textarea class="form-control" rows="5" id="Texte" name="texte"></textarea>
</div>
    </div>
    <div class="col-sm-2 col-xs-1">
     <!-- cellule vide pour mise en page -->
    </div>
  </div>
  <!-- Contient Date -->
   <div class="row">
    <div class="col-sm-2 col-xs-1">
       <!-- cellule vide pour mise en page -->
    </div>
    <div class="col-sm-8 col-xs-10">
      <div class="form-group">
  <label for="usr">Date du prochain conseil municipal:</label>
  <input type="date" class="form-control" id="Date" name="date" value="2019-01-30">
</div>
    </div>
    <div class="col-sm-2 col-xs-1">
     <!-- cellule vide pour mise en page -->
    </div>
  </div>
   <!-- Contient bouton enregistrer -->
    <div class="row">
    <div class="col-sm-2 col-xs-1">
       <!-- cellule vide pour mise en page -->
    </div>
    <div class="col-sm-8 col-xs-10">
      <div class="form-group">
  <input class="btn btn-info" type="submit" value="Enregistrer">
  <a href="/ProjetPanneau/ServletIndex" class="btn btn-info" role="button">Liste des panneaux</a>
 
</div>
    </div>
    <div class="col-sm-2 col-xs-1">
     <!-- cellule vide pour mise en page -->
    </div>
  </div>
  </form>
</div><!-- /.container -->
</body>
</html>