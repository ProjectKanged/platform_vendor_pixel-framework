/*
 * Copyright (C) 2022 The PixelExperience Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.systemui.assist;

import android.content.Context;
import android.os.ServiceManager;
import com.android.internal.widget.ILockSettings;

import com.android.systemui.dagger.SysUISingleton;

import javax.inject.Inject;

@SysUISingleton
public class OpaEnabledSettings {

    private final Context mContext;
    private final ILockSettings mLockSettings = ILockSettings.Stub.asInterface(ServiceManager.getService("lock_settings"));

    @Inject
    public OpaEnabledSettings(Context context) {
        mContext = context;
    }

    public boolean isOpaEligible() {
        return true;
    }

    public void setOpaEligible(boolean z) {
    }

    public boolean isOpaEnabled() {
        return true;
    }

    public void setOpaEnabled(boolean z) {
    }

    public boolean isAgsaAssistant() {
        return OpaUtils.isAGSACurrentAssistant(mContext);
    }
}
