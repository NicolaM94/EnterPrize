package view

import tornadofx.*
import Classes.*
import Classes.Balances.CostOfSalesBalance
import Classes.Balances.TableContent
import javafx.beans.property.ListProperty
import javafx.beans.property.ObjectProperty
import javafx.beans.value.ObservableValue
import javafx.geometry.NodeOrientation
import javafx.geometry.Orientation
import javafx.scene.Node
import javafx.scene.layout.Background
import javafx.scene.layout.BackgroundFill
import javafx.scene.layout.Priority
import javafx.scene.paint.Color
import javafx.stage.FileChooser
import java.awt.Insets
import java.awt.Paint
import java.io.File
import javax.swing.text.html.CSS

class MainView :View () {


    override val root = tableview (TableContent.allCountsProperty) {

        vboxConstraints {
            vgrow = Priority.ALWAYS
        }

        column("ID",Count::countId)
        column("Nome",Count::countName)
        column("Valore",Count::countValue)
        column("Tipo",Count::countType)
        column("Durata",Count::countDuration)

        contextmenu {
            item("Modifica").action {
                val a = find(FirstView::class)
                openInternalWindow(ModifierPopUp::class,owner = a.root)
        }

    }

    }
}

