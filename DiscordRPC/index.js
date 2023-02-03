const RPC = require("discord-rpc");
const rpc = new RPC.Client({
    transport: "ipc"
});

rpc.on("ready", () => {
    rpc.setActivity({
        details: "Founder",
        state: "In dev",
        startTimestamp: new Date(),
        largeImageKey: "logorond",
        smallImageKey: "dev",
        largeImageText: "Logo - Script Corp",
        smallImageText: "Dev",
        buttons: [{label: "Visiter le site", url : "https://scriptcorp.ch"}]
    });
    console.log("Script Corp presence is running");
});

rpc.login({
    clientId: "1055518048737579110"
});