package view

import tornadofx.*

class WorkingSpace :Workspace () {

    init {

        add(ActivityMenu::class)
        add(FileMenu::class)

    }



}