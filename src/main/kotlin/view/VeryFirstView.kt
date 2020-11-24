package view

import tornadofx.*

class VeryFirstView :Workspace () {

    init {

        add(ActivityMenu::class)
        add(FileMenu::class)

    }



}