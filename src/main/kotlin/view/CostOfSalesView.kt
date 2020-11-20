package view
import Classes.Balances.CostOfSalesBalance
import Classes.RevenuesClass
import javafx.geometry.Side
import javafx.scene.layout.Border
import javafx.scene.layout.BorderStroke
import javafx.scene.layout.Priority
import javafx.scene.text.FontWeight
import tornadofx.*
import java.awt.Color
import java.awt.Paint

class CostOfSalesView :View() {

    val menu:MenuView by inject()

    override val root = borderpane {
        title = "EnterPrize - Conto Economico al costo del venduto"

        top = menu.root

        left = form {
            fieldset ("Gestione Operativa"){
                field ("+ Ricavi netti") { label(CostOfSalesBalance.netRevenues().toString()) }
                field ("- Costo del venduto"){label(CostOfSalesBalance.costOfSales().toString()) }
                field ("\tRisultato operativo lordo"){ label(CostOfSalesBalance.grossOperativeResult.toString()) }
            }
            fieldset ("Gestione Commerciale"){
                field ("+ Ricavi della gestione commerciale") { label(CostOfSalesBalance.commercialRevenues().toString()) }
                field ("- Costi della gestione commerciale"){ label(CostOfSalesBalance.commercialCosts().toString()) }
                field ("\tRisultato operativo netto") {label(CostOfSalesBalance.operativeResult.toString())}
            }
            fieldset ("Gestione Finanziaria"){
                field ("+ Ricavi della getione finanziaria"){ label(CostOfSalesBalance.financialRevenues().toString()) }
                field("- Costi della gestione finanziaria"){  label(CostOfSalesBalance.financialCosts().toString()) }
                field ("\tRisultato della gestione") { label(CostOfSalesBalance.managerialResult.toString()) }
            }
            fieldset ("Gestione Straordinaria"){
                field ("+ Ricavi della gestione straordinaria"){ label(CostOfSalesBalance.extraordinaryRevenues().toString()) }
                field ("- Costi della gestione straordinaria"){  label(CostOfSalesBalance.extraordinaryCosts().toString())}
                field ("Reddito ante imposte"){  label(CostOfSalesBalance.earningBeforeTaxes.toString()){
                    style { fontWeight = FontWeight.BOLD }
                } }

            }
        }

        center = vbox {
            piechart {
                title = "Composizione dei ricavi"
                data("Ricavi Operativi", CostOfSalesBalance.netRevenues() / CostOfSalesBalance.totalRevenues)
                data("Ricavi Commerciali", CostOfSalesBalance.commercialRevenues() / CostOfSalesBalance.totalRevenues)
                data("Ricavi Finanziari", CostOfSalesBalance.financialRevenues() / CostOfSalesBalance.totalRevenues)
                data("Ricavi extra gestione", CostOfSalesBalance.extraordinaryRevenues() / CostOfSalesBalance.totalRevenues)
                }
            /*piechart {
                title = "Composizione dei costi"
                data("Costi Operativi", CostOfSalesBalance.costOfSales() / CostOfSalesBalance.totalCosts)
                data("Costi Commerciali", CostOfSalesBalance.commercialCosts() / CostOfSalesBalance.totalCosts)
                data("Costi Finanziari", CostOfSalesBalance.financialCosts() / CostOfSalesBalance.totalCosts)
                data("Costi extra gestione", CostOfSalesBalance.extraordinaryCosts() / CostOfSalesBalance.totalCosts)
                this.labelsVisible = false
                this.legendSide = Side.LEFT
                this.scaleX = 0.75
                this.scaleY = 0.75
            }*/
        }

        right = listview <String> {
            hboxConstraints {
                hGrow = Priority.ALWAYS
            }
            items.addAll("Indice di redditività (Ricavi/Costi): ${CostOfSalesBalance.totalRevenues/CostOfSalesBalance.totalCosts}")
        }


    }
}