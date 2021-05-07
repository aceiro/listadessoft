package com.unicep.app.listadessoft.lista

interface Printer{
    fun onPrinterSetup()
}

class PrinterSetup: Printer {
    override fun onPrinterSetup() {
        println("onPrinterSetup")
    }
}