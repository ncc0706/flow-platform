/*
 * Copyright 2017 flow.ci
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.flow.platform.api.test.util;

import com.flow.platform.api.domain.EmailSettingContent;
import com.flow.platform.api.test.TestBase;
import com.flow.platform.api.util.SmtpUtil;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author yh@firim
 */
public class SmtpUtilTest extends TestBase {

    @Test
    public void should_auth_success(){
        EmailSettingContent emailSetting = new EmailSettingContent("smtp.163.com", 465, "xxxx@163.com");
        Assert.assertEquals(false, SmtpUtil.authentication(emailSetting));
    }
}
