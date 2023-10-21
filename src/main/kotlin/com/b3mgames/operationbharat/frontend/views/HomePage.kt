package com.b3mgames.operationbharat.frontend.views

import com.b3mgames.operationbharat.frontend.MainLayout
import com.b3mgames.operationbharat.shared.SharedConstants
import com.github.mvysny.karibudsl.v10.*
import com.vaadin.flow.component.Unit
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route

@PageTitle(value = SharedConstants.AppConfig.NAME)
@Route(value = "", layout = MainLayout::class)
class HomePage : KComposite() {
    private val root = ui {
        verticalLayout(isPadding = false, isSpacing = false, block = {
            content { align(stretch, top) }
            image(src = "https://images.pexels.com/photos/147411/italy-mountains-dawn-daybreak-147411.jpeg") {
                setWidthFull()
                setHeight(10f, Unit.PERCENTAGE)
            }
            horizontalLayout {
                textField {
                    placeholder = "Enter your email ..."
                    setTooltipText("Get All the updates ...")
                }
                button {
                    themeName = "outlined"
                    text = "Subscribe"
                    onLeftClick {

                    }
                }
            }
        })
    }
}
