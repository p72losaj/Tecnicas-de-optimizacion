<!DOCTYPE html>

<html>
	<title>FUNCIONALIDADES SISTEMA</title>
	<body>
		<h1>DATOS DE LA MEMORIA CACHE</h1>
		<script>
		function obtenerDatos(){
			var C = parseFloat(document.getElementByID('C').value);
			document.registro.C.value = C;
		}
		</script>
		<table border = "1">
			<tr>
				<td>Numero de conjuntos o sets:
					<td><input type="text" name="C" id = "C"> </td>
				</td>
			</tr>
		</table>
		<button type="button" onclick="window.location = 'index.jsp'">REINICIAR</button>
		<button type = "button" onclick = "window.location = "memoriaCache.jsp">VOLVER A LA PAGINA ANTERIOR</button>
	</body>
</html>
