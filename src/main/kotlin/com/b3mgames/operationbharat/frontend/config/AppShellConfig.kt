package com.b3mgames.operationbharat.frontend.config

import com.b3mgames.operationbharat.shared.SharedConstants
import com.vaadin.flow.component.dependency.NpmPackage
import com.vaadin.flow.component.page.AppShellConfigurator
import com.vaadin.flow.component.page.Meta
import com.vaadin.flow.server.AppShellSettings
import com.vaadin.flow.server.PWA
import com.vaadin.flow.theme.Theme
import com.vaadin.flow.theme.lumo.Lumo

@PWA(name = SharedConstants.AppConfig.NAME, shortName = SharedConstants.AppConfig.SHORT_NAME)
@NpmPackage(value = "@fontsource/ubuntu", version = "4.5.0")
@Theme(value = "operationbharat", variant = Lumo.DARK)
class AppShellConfig : AppShellConfigurator {
    override fun configurePage(settings: AppShellSettings?) {
        super.configurePage(settings)
    }
}