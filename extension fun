fun main() = runBlocking {
    // Kode coroutines di sini
}

class MyActivity : AppCompatActivity(), CoroutineScope {
    private lateinit var job: Job

    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        job = Job()

        launch {
            // Kode coroutines di sini
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }
}
