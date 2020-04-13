/**
 * Odoo, Open Source Management Solution
 * Copyright (C) 2012-today Odoo SA (<http:www.odoo.com>)
 * <p/>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 * <p/>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 * <p/>
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http:www.gnu.org/licenses/>
 * <p/>
 * Created on 30/12/14 3:11 PM
 */
package com.odoo.config;

import android.util.Log;

import com.odoo.addons.customers.Customers;
import com.odoo.core.support.addons.AddonsHelper;
import com.odoo.core.support.addons.OAddon;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Addons extends AddonsHelper {

    /**
     * Declare your required module here
     * NOTE: For maintain sequence use object name in asc order.
     * Ex.:
     * OAddon partners = new OAddon(Partners.class).setDefault();
     * for maintain sequence call withSequence(int sequence)
     * OAddon partners = new OAddon(Partners.class).withSequence(2);
     */
    OAddon customers = new OAddon(Customers.class).setDefault();
    //OAddon yourCustomAddon = new OAddon(yourCustomAddon.class);

    public static final String TAG = Addons.class.getSimpleName();

    //The field has to be instantiated, so that the prepareAddons method
    //in AddonsHelper.java can see it. The constructor below does that.
    //If you register a new addon, make sure you use it in a Log so it is instantiated.
    public Addons() {
        for (Field addon: getClass().getDeclaredFields()) {
            Log.i(TAG, "Addons>Addons: " + customers);
            //Log.i(TAG, "Your custom addon: " + yourCustomAddon);
        }
    }


}
