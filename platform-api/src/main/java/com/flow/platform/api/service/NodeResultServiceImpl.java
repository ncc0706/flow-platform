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

package com.flow.platform.api.service;

import com.flow.platform.api.dao.NodeResultDao;
import com.flow.platform.api.domain.Job;
import com.flow.platform.api.domain.Node;
import com.flow.platform.api.domain.NodeResult;
import java.math.BigInteger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author gyfirim
 */
public class NodeResultServiceImpl implements NodeResultService {

    @Autowired
    private NodeResultDao nodeResultDao;

    @Autowired
    private JobYmlStorgeService ymlStorgeService;

    @Override
    public NodeResult create(Job job) {
        Node node = (Node) ymlStorgeService.get(job.getId());
        return null;
    }

    @Override
    public NodeResult find(String nodePath, BigInteger jobId) {
        return null;
    }

    @Override
    public NodeResult save(BigInteger jobId, Node node) {
        return null;
    }

    @Override
    public NodeResult update(NodeResult nodeResult) {
        return null;
    }
}
