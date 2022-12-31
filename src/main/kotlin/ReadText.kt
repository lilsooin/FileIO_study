import java.io.File
import java.io.FileInputStream
import java.io.FileReader

fun main() {

    val folderPath  = File("C:\\aa")
    println(folderPath.exists())

    val newFolderPath = folderPath.absolutePath + File.separator + "newFolder"
    val newFolder = File(newFolderPath)
    if(newFolder.exists().not()){
        newFolder.mkdirs()
    }

  /*  val fileInputStream = FileInputStream("C:\\aa\\Hello.java") // 파일을 가져올 수 있지만 제대로 읽을 수 없음
    while(fileInputStream.read() != -1){
        println(fileInputStream.read())
    }*/

    val fileReader = FileReader("C:\\aa\\Hello.java")
    println("reader >>> ${fileReader.readLines()}") // 읽어짐

}