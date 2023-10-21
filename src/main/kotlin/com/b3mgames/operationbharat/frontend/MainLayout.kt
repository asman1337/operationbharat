package com.b3mgames.operationbharat.frontend

/*
 * MainLayout class defines the layout for the web application.
 * It extends the Vaadin AppLayout and provides the navigation structure, header, and footer.
 *
 * Developer: Asman Mirza
 * Email: rambo007.am@gmail.com
 * Date: 2023-10-21
 */

import com.b3mgames.operationbharat.frontend.views.BlogPage
import com.b3mgames.operationbharat.frontend.views.HomePage
import com.b3mgames.operationbharat.shared.SharedConstants
import com.vaadin.flow.component.applayout.AppLayout
import com.vaadin.flow.component.applayout.DrawerToggle
import com.vaadin.flow.component.html.*
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.component.orderedlayout.HorizontalLayout
import com.vaadin.flow.component.orderedlayout.Scroller
import com.vaadin.flow.component.sidenav.SideNav
import com.vaadin.flow.component.sidenav.SideNavItem
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.theme.lumo.LumoUtility
import org.vaadin.lineawesome.LineAwesomeIcon

class MainLayout : AppLayout() {
    private lateinit var viewTitle: H2

    // Constructor for the MainLayout class
    init {
        setPrimarySection(Section.DRAWER)
        addDrawerContent()
        addHeaderContent()
    }

    // Adds header content to the layout
    private fun addHeaderContent() {
        val toggle = DrawerToggle()
        toggle.setAriaLabel("Menu toggle")
        toggle.click()
        viewTitle = H2()
        viewTitle.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE)
        addToNavbar(true, toggle, viewTitle)
    }

    // Adds drawer content to the layout
    private fun addDrawerContent() {
        val appName = H1(SharedConstants.AppConfig.SHORT_NAME)
        appName.addClassNames(LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE)
        val header = Header(appName)
        val scroller = Scroller(createNavigation())
        addToDrawer(header, scroller, createFooter())
    }

    // Creates the navigation menu with side items
    private fun createNavigation(): SideNav {
        val nav = SideNav()
        nav.addItem(SideNavItem("Home", HomePage::class.java, LineAwesomeIcon.GLOBE_SOLID.create()))
        nav.addItem(SideNavItem("Blog", BlogPage::class.java, LineAwesomeIcon.FILE.create()))
        return nav
    }

    // Creates the footer
    private fun createFooter(): Footer {
        return Footer()
    }

    // Updates the view title based on the current page
    override fun afterNavigation() {
        super.afterNavigation()
        viewTitle.text = getCurrentPageTitle()
    }

    // Retrieves the title of the current page
    private fun getCurrentPageTitle(): String {
        val title = content.javaClass.getAnnotation(PageTitle::class.java)
        return title?.value ?: ""
    }

    // Creates the header with the application logo
    private fun createHeader() {
        H4(SharedConstants.AppConfig.SHORT_NAME).let { logo ->
            HorizontalLayout(logo).let { header ->
                header.defaultVerticalComponentAlignment = FlexComponent.Alignment.CENTER
                header.setWidthFull()
                addToNavbar(header)
            }
        }
    }
}
