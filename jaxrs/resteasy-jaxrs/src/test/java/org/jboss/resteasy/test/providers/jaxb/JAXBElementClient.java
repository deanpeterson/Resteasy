/*
 * JBoss, the OpenSource J2EE webOS
 * 
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package org.jboss.resteasy.test.providers.jaxb;

import javax.ws.rs.ConsumeMime;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.ProduceMime;
import javax.xml.bind.JAXBElement;

/**
 * 
 * A JAXBXmlRootElementClient.
 * 
 * @author <a href="ryan@damnhandy.com">Ryan J. McDonough</a>
 * @version $Revision:$
 */
@ConsumeMime("application/xml")
@ProduceMime("application/xml")
public interface JAXBElementClient
{

   @GET
   @Path("/{name}")
   JAXBElement<Parent> getParent(@PathParam("name") String name);

   @POST
   JAXBElement<Parent> postParent(JAXBElement<Parent> parent);

}