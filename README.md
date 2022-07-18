# io
Short explanation of Inputs and Outputs (Streams, Readers and Writers)



INPUTS / ENTRADAS / LEITURA
- InputStream	(bytes)
	files: FileInputStream
	console: System.in
	networks: Socket socket = new Socket(); socket.getInputStream();
- Reader (characteres)
	InputStremReader -> FileReader
	BufferedReader


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



-----------------------------------------------------------



InputStream 		-> InputStreamReader 		-> Reader
stream of bytes		character					stream of character		
					make a stream of bytes in a character, in a reader

OutputStream 		-> OutputStreamWriter 		-> Writer
stream of bytes		character					stream of character		
					make a stream of bytes in a character, in a writer



-----------------------------------------------------------



Stream 
lê/escreve bytes
fluxo de dados binarios

Reader 
lê caracteres ou dados binarios	

Writer 
escreve caracteres ou dados binarios	



-----------------------------------------------------------



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


no final é preciso fechar o bufferedReader
.close()
ele já fecha o InputStreamReader e o FileInputStream

Jogar o arquivo na raiz do projeto
