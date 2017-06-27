package openevent.network;

public final class DataDownloadManager {
    private static DataDownloadManager instance;

    private APIClient client = new APIClient();

    private DataDownloadManager() {}

    public static DataDownloadManager getInstance() {
        if (instance == null) {
            instance = new DataDownloadManager();
        }
        return instance;
    }

    public void downloadEvents() {
        client.getApiService().getEvent().enqueue(new ResponseProcessor<>());
    }

    public void downloadTracks() {
        client.getApiService().getTracks().enqueue(new ResponseProcessor<>());
    }

    public void downloadSpeakers() {
        client.getApiService().getSpeakers().enqueue(new ResponseProcessor<>());
    }

    public void downloadSponsors() {
        client.getApiService().getSponsors().enqueue(new ResponseProcessor<>());
    }

    public void downloadSessions() {
        client.getApiService().getSessions().enqueue(new ResponseProcessor<>());
    }

    public void downloadMicrolocations() {
        client.getApiService().getMicrolocations().enqueue(new ResponseProcessor<>());
    }
}
