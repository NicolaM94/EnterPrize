package view
import Classes.Balances.CostOfSalesBalance
import Classes.RevenuesClass
import javafx.geometry.Side
import javafx.scene.chart.CategoryAxis
import javafx.scene.chart.NumberAxis
import javafx.scene.layout.Border
import javafx.scene.layout.BorderStroke
import javafx.scene.layout.Priority
import javafx.scene.text.FontWeight
import tornadofx.*
import java.awt.Color
import java.awt.Paint

class CostOfSalesView :View() {

    val menu = find(MenuView::class)

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
                isLegendVisible = false
                }
            piechart {
                title = "Composizione dei costi"
                data("Costi Operativi", CostOfSalesBalance.costOfSales() / CostOfSalesBalance.totalCosts)
                data("Costi Commerciali", CostOfSalesBalance.commercialCosts() / CostOfSalesBalance.totalCosts)
                data("Costi Finanziari", CostOfSalesBalance.financialCosts() / CostOfSalesBalance.totalCosts)
                data("Costi extra gestione", CostOfSalesBalance.extraordinaryCosts() / CostOfSalesBalance.totalCosts)
                isLegendVisible = false
            }
            barchart("Margine ricavo-costo delle aree", CategoryAxis(), NumberAxis()) {
                series("Ricavi") {
                    data("Operativi",CostOfSalesBalance.netRevenues())
                    data("Commerciali",CostOfSalesBalance.commercialRevenues())
                    data("Finanziari",CostOfSalesBalance.financialRevenues())
                    data("Extra",CostOfSalesBalance.extraordinaryRevenues())
                }
                series ("Costi") {
                    data("Operativi",CostOfSalesBalance.costOfSales())
                    data("Commerciali",CostOfSalesBalance.commercialCosts())
                    data("Finanziari",CostOfSalesBalance.financialCosts())
                    data("Extra",CostOfSalesBalance.extraordinaryCosts())

                }
            }
        }

        right = listview <String> {
            style {
                setPrefWidth(350.0)
            }
            items.addAll(
                    "Indice di redditività (Ricavi/Costi): ${(CostOfSalesBalance.totalRevenues/CostOfSalesBalance.totalCosts).toFloat()}",
                    "Indice di redditività operativa: ${(CostOfSalesBalance.netRevenues()/CostOfSalesBalance.costOfSales()).toFloat()}",
                    "Indice di redditività commerciale: ${(CostOfSalesBalance.commercialRevenues()/CostOfSalesBalance.commercialCosts()).toFloat()}",
                    "Indice di redditivitò finanziaria: ${(CostOfSalesBalance.financialCosts()/CostOfSalesBalance.financialCosts()).toFloat()}",
                    "Indice di redditività extra gestione: ${(CostOfSalesBalance.extraordinaryRevenues()/CostOfSalesBalance.extraordinaryCosts()).toFloat()}"
            )

        }


    }
}