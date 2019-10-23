package com.osl.testcuba.web.screens.cliente;

import com.haulmont.cuba.gui.screen.*;
import com.osl.testcuba.entity.Cliente;
import com.osl.testcuba.web.MyStandardLookup;

@UiController("testcuba_Cliente.browse")
@UiDescriptor("cliente-browse.xml")
@LookupComponent("clientesTable")
@LoadDataBeforeShow
public class ClienteBrowse extends MyStandardLookup<Cliente> {
}