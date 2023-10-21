package com.b3mgames.operationbharat.frontend.views

import com.b3mgames.operationbharat.frontend.MainLayout
import com.github.mvysny.karibudsl.v10.KComposite
import com.github.mvysny.karibudsl.v10.verticalLayout
import com.vaadin.flow.component.html.H1
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route

@PageTitle(value = "Blog")
@Route(value = "blog", layout = MainLayout::class)
class BlogPage : KComposite() {
    private val root = ui {
        verticalLayout(isPadding = false, isSpacing = false, block = {
            H1("Hello ....")
        })
    }
}