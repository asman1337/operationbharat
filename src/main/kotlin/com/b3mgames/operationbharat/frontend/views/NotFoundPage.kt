package com.b3mgames.operationbharat.frontend.views

import com.b3mgames.operationbharat.frontend.MainLayout
import com.vaadin.flow.component.html.H2
import com.vaadin.flow.component.html.Image
import com.vaadin.flow.component.html.Paragraph
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode
import com.vaadin.flow.component.orderedlayout.VerticalLayout
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import com.vaadin.flow.theme.lumo.LumoUtility.Margin

@PageTitle("404 - Not Found")
@Route(value = "404", layout = MainLayout::class)
class NotFoundPage : VerticalLayout() {
    init {
        isSpacing = false
        val img = Image("images/empty-plant.png", "placeholder plant")
        img.width = "200px"
        add(img)
        val header = H2("This place intentionally left empty")
        header.addClassNames(Margin.Top.XLARGE, Margin.Bottom.MEDIUM)
        add(header)
        add(Paragraph("It’s a place where you can grow your own UI 🤗"))
        setSizeFull()
        setJustifyContentMode(JustifyContentMode.CENTER)
        defaultHorizontalComponentAlignment = FlexComponent.Alignment.CENTER
        style["text-align"] = "center"
    }
}