/*
 * Copyright 2000-2017 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.b3mgames.operationbharat.frontend.utils;

/*
 * The SimpleI18NProvider class implements the I18NProvider interface for internationalization (i18n).
 * It provides translations for English and Chinese locales.
 *
 * Developer: Asman Mirza
 * Email: rambo007.am@gmail.com
 * Date: 2023-10-21
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Component;
import com.vaadin.flow.i18n.I18NProvider;

@Component
public class SimpleI18NProvider implements I18NProvider {

    @Override
    public List<Locale> getProvidedLocales() {
        // Returns an unmodifiable list of supported locales
        return Collections.unmodifiableList(Arrays.asList(Locale.ENGLISH, Locale.CHINESE));
    }

    @Override
    public String getTranslation(String key, Locale locale, Object... params) {
        // Provides translations for specific keys and locales
        if (Locale.ENGLISH.equals(locale)) {
            if (key.equals("root.navigate_to_component")) {
                return "Navigate to another component";
            }
        } else if (Locale.CHINESE.equals(locale)) {
            if (key.equals("root.navigate_to_component")) {
                return "前往另一视图";
            }
        }
        return null; // Return null for keys not found
    }
}
