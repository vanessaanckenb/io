# io

</br>
</br>

INPUTS / ENTRADAS / LEITURA
- InputStream	(bytes)
	files: FileInputStream
	console: System.in
	networks: Socket socket = new Socket(); socket.getInputStream();
- Reader (characteres)
	InputStremReader -> FileReader
	BufferedReader
	
</br>
</br>

OUTPUTS / SAÍDAS / ESCRITA
- OutputStream (bytes)
	files: 
		FileOutputStream
		FilterOutputStream -> PrintStream
	console: System.out
	networks: Socket socket = new Socket(); socket.getOutputStream();
- Writer (characteres)
	OutputStremWriter -> FileWriter
	BufferedWriter
	PrintWriter

</br>
</br>
</br>

-----------------------------------------------------------

</br>
</br>
</br>


InputStream 		-> InputStreamReader 		-> Reader
stream of bytes		character					stream of character		
					make a stream of bytes in a character, in a reader
					
</br>

OutputStream 		-> OutputStreamWriter 		-> Writer
stream of bytes		character					stream of character		
					make a stream of bytes in a character, in a writer

</br>
</br>
</br>

-----------------------------------------------------------

</br>
</br>
</br>

Stream 
lê/escreve bytes
fluxo de dados binarios

</br>

Reader 
lê caracteres ou dados binarios	

</br>

Writer 
escreve caracteres ou dados binarios	

</br>
</br>
</br>

-----------------------------------------------------------

</br>
</br>
</br>

FileInputStream
	fluxo de entrada com um arquivo
	cria um fluxo do arquivo binario
	lê os bytes dos dados do arquivo de entrada
InputStreamReader
	pega o int de bytes e transforma em caracteres
	transforma os bytes em um array de caracteres (le caracter por caracter)
BufferedReader
	recebe um array de caracteres
	guarda os caracteres de uma linha em um buffer
	guarda os caracteres de uma linha em um buffered

</br>
</br>

no final é preciso fechar o bufferedReader
.close()
ele já fecha o InputStreamReader e o FileInputStream

</br>

Jogar o arquivo na raiz do projeto.
