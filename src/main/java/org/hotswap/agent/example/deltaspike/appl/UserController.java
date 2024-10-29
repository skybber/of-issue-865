package org.hotswap.agent.example.deltaspike.appl;

import jakarta.inject.Named;
import java.io.Serializable;

import org.omnifaces.cdi.ViewScoped;

@Named
@ViewScoped
public class UserController implements Serializable {

    private static final long serialVersionUID = -4538115105092134763L;

    public void throwException()
		{
        throw new RuntimeException();
    }
}
