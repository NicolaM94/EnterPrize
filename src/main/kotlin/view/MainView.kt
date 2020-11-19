package view

import tornadofx.*
import Classes.*
import Classes.Balances.CostOfSalesBalance
import javafx.geometry.NodeOrientation
import javafx.geometry.Orientation
import javafx.scene.Node
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.paint.Color
import javafx.stage.FileChooser
import java.awt.Insets
import java.awt.Paint
import javax.swing.text.html.CSS

class MainView :View () {

    var pathToBalance :String

    init {
        val fileChooser = chooseFile("EnterPrize - CARICA IL BILANCIO", arrayOf(FileChooser.ExtensionFilter("Excell File","*.xlsx")))
        pathToBalance = fileChooser.get(0).absolutePath

    }

    val menu :MenuView by inject()



    override val root = borderpane {

        title = "EnterPrize @Nicola Moro - 2020"

        top = menu.root

        center = tableview (RDVBalanceContentCatcher(pathToBalance).allCountsProperty) {

                column("ID",Count::countId)
                column("Nome",Count::countName)
                column("Valore",Count::countValue)
                column("Tipo",Count::countType)
                column("Durata",Count::countDuration)
        }
    }
}