/*
 * Copyright 2009-2013 Scale Unlimited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package bixo.fetcher.simulation;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;



public class TestWebServer extends SimulationWebServer {

    private Server _server;
    
    public TestWebServer(AbstractHandler handler, int port) throws Exception {
        _server = startServer(handler, port);
    }
    
    public void stop() {
        try {
            _server.stop();
        } catch (Exception e) {
            
        }
    }

}
