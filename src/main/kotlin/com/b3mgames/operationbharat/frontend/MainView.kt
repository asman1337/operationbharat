package com.b3mgames.operationbharat.frontend

import com.b3mgames.operationbharat.shared.SharedConstants
import com.github.mvysny.karibudsl.v10.KComposite
import com.github.mvysny.karibudsl.v10.verticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route

@PageTitle(value = SharedConstants.AppConfig.NAME)
@Route("")
class MainView : KComposite() {
    private val root = ui {
        verticalLayout {

        }
    }
}