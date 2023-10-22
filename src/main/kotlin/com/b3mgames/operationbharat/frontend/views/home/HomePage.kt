package com.b3mgames.operationbharat.frontend.views.home

import com.b3mgames.operationbharat.frontend.MainLayout
import com.b3mgames.operationbharat.shared.SharedConstants
import com.github.mvysny.karibudsl.v10.*
import com.vaadin.flow.component.Component
import com.vaadin.flow.component.HasComponents
import com.vaadin.flow.component.button.ButtonVariant
import com.vaadin.flow.component.icon.VaadinIcon
import com.vaadin.flow.component.orderedlayout.FlexComponent
import com.vaadin.flow.router.PageTitle
import com.vaadin.flow.router.Route
import org.vaadin.lineawesome.LineAwesomeIcon

@PageTitle(value = SharedConstants.AppConfig.NAME)
@Route(value = "", layout = MainLayout::class)
class HomePage : KComposite() {
    private val root = ui {
        div {
            addClassName("top-section")
            // Top Section (with background image)
            image("images/operation_bharat_game_banner.png") {
                setSizeFull()
            }

            // Centered Subscription Form
            div {
                addClassName("centered-form")
                verticalLayout(isPadding = false, isSpacing = false) {
                    h1 { text(text = SharedConstants.AppConfig.SHORT_NAME) }
                    p { text(text = "Lock and load, soldier. Your mission is about to begin.") }

                    verticalLayout(isPadding = false, isSpacing = false) {
                        h3 { text(text = "JOIN OUR CLOSED BETA") }

                        horizontalLayout(isPadding = false, isSpacing = true) {
                            alignItems = FlexComponent.Alignment.CENTER
                            emailField {
                                placeholder = "Email address"
                                errorMessage = "Enter a valid email address"
                                prefixComponent = VaadinIcon.MAILBOX.create()
                                isClearButtonVisible = true
                                setTooltipText("Be a part of our closed beta.")
                            }
                            button {
                                addThemeVariants(ButtonVariant.LUMO_PRIMARY)
                                text = "JOIN"
                                onLeftClick {
                                    // Handle subscription action here
                                }
                            }

                            image("images/playstore_dark.png", alt = "") {
                                width = "90px"
                                height = "90px"
                            }
                        }
                        socialMediaIcons()
                    }
                }
            }
        }
    }

    private fun HasComponents.socialMediaIcons() {
        horizontalLayout(isPadding = false, isSpacing = true) {
            addClassName("social-media-icons")

            button(icon = LineAwesomeIcon.DISCORD.create()) {
                setTooltipText("Discord")
                onLeftClick {
                    openLinkInNewTab(url = "https://discord.gg/bNeCDRSnPV")
                }
            }
            button(icon = LineAwesomeIcon.TELEGRAM.create()) {
                setTooltipText("Telegram")
                onLeftClick {
                    openLinkInNewTab(url = "https://t.me/OperationBharat")
                }
            }
            button(icon = LineAwesomeIcon.TWITTER.create()) {
                setTooltipText("Twitter")
                onLeftClick {
                    openLinkInNewTab(url = "https://twitter.com/operationbharat")
                }
            }
            button(icon = LineAwesomeIcon.FACEBOOK.create()) {
                setTooltipText("Facebook")
                onLeftClick {
                    openLinkInNewTab(url = "https://www.facebook.com/operationbharat")
                }
            }
            button(icon = LineAwesomeIcon.INSTAGRAM.create()) {
                setTooltipText("Instagram")
                onLeftClick {
                    openLinkInNewTab(url = "https://www.instagram.com/operation_bharat")
                }
            }
            button(icon = LineAwesomeIcon.YOUTUBE.create()) {
                setTooltipText("Instagram")
                onLeftClick {
                    openLinkInNewTab(url = "https://www.youtube.com/@OperationBharat")
                }
            }
        }
    }
    private fun Component.openLinkInNewTab(url: String) {
        ui.get().page.open(url, "_blank")
    }
}
