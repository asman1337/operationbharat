package com.b3mgames.operationbharat.frontend

import com.b3mgames.operationbharat.shared.SharedConstants
import com.vaadin.flow.component.page.AppShellConfigurator
import com.vaadin.flow.server.AppShellSettings
import com.vaadin.flow.server.PWA

@PWA(name = SharedConstants.AppConfig.NAME, shortName = SharedConstants.AppConfig.SHORT_NAME)
class PWAShell : AppShellConfigurator {
    override fun configurePage(settings: AppShellSettings?) {
        super.configurePage(settings)
    }
}