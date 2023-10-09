object Main extends App {
  def run = while (true) {
    println(s"total - ${Runtime.getRuntime.totalMemory / 1024 / 1024} max - ${Runtime.getRuntime.maxMemory() / 1024 / 1024} free - ${Runtime.getRuntime.freeMemory() / 1024 / 1024}")
    Thread.sleep(30000)
  }

  new Thread(() => run){
    setDaemon(true)
    start()
  }
  Console.in.readLine()
}