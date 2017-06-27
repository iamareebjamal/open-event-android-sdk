package openevent.network;

public final class DataDownloadManager {
    private static DataDownloadManager instance;

    private APIClient client = new APIClient();
    private ResponseProcessor responseProcessor = new ResponseProcessor<>();

    private DataDownloadManager() {
    }

    public static DataDownloadManager getInstance() {
        if (instance == null) {
            instance = new DataDownloadManager();
        }
        return instance;
    }

    public void downloadEvents() {
        client.getApiService().getEvent().enqueue(responseProcessor);
    }

    public void downloadTracks() {
        client.getApiService().getTracks().enqueue(responseProcessor);
    }

    public void downloadSpeakers() {
        client.getApiService().getSpeakers().enqueue(responseProcessor);
    }

    public void downloadSponsors() {
        client.getApiService().getSponsors().enqueue(responseProcessor);
    }

    public void downloadSessions() {
        client.getApiService().getSessions().enqueue(responseProcessor);
    }

    public void downloadMicrolocations() {
        client.getApiService().getMicrolocations().enqueue(responseProcessor);
    }
}
