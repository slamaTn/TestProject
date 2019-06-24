<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calculatrice</title>
</head>
<body>

	<form method="POST" action="Calculatrice">

		<fieldset>
			</br>
			<legend>Calculatrice</legend>

			<input type="text" name="operande1" id="op1" placeholder="numero 1" /> 
			<select
				name="operateur" id="op">
				<option value="0" selected>+</option>
				<option value="1">-</option>
				<option value="2">*</option>
				<option value="3">/</option>
			</select> 
			<input type="text" name="operande2" id="p2"  placeholder="numero 2" />
			
			<input type="submit" value="Envoyer" />
			
			<p>
				Resultat de l'equation : ${ empty resultat ? '' :  resultat }
			</p>

		</fieldset>


	</form>

</body>
</html>