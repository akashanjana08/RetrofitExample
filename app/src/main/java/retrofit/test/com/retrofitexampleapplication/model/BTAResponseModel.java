package retrofit.test.com.retrofitexampleapplication.model;

import java.util.List;

/**
 * Created by akash.sharma on 12/14/2017.
 */

public class BTAResponseModel {


    private BTAResponseBean BTAResponse;

    public BTAResponseBean getBTAResponse() {
        return BTAResponse;
    }

    public void setBTAResponse(BTAResponseBean BTAResponse) {
        this.BTAResponse = BTAResponse;
    }

    public static class BTAResponseBean {

        private DisplayListBean DisplayList;
        private PricingBean Pricing;
        private MoviesBean Movies;

        public DisplayListBean getDisplayList() {
            return DisplayList;
        }

        public void setDisplayList(DisplayListBean DisplayList) {
            this.DisplayList = DisplayList;
        }

        public PricingBean getPricing() {
            return Pricing;
        }

        public void setPricing(PricingBean Pricing) {
            this.Pricing = Pricing;
        }

        public MoviesBean getMovies() {
            return Movies;
        }

        public void setMovies(MoviesBean Movies) {
            this.Movies = Movies;
        }

        public static class DisplayListBean {
            /**
             * totalDisplayItems : 39
             * count : 39
             * DisplayItem : [{"count":1,"MovieRef":{"ref":"skynetBSKY2013112710442058"}},{"count":1,"MovieRef":{"ref":"skynetBSKY2013102914312434"}},{"count":1,"MovieRef":{"ref":"skynetBSKY2013100215144329"}},{"count":1,"MovieRef":{"ref":"vtmnewsBVMM2012021313133429"}},{"count":1,"MovieRef":{"ref":"VODVOD21465200"}},{"count":1,"MovieRef":{"ref":"VODVOD21417800"}},{"count":1,"MovieRef":{"ref":"VODVOD9808100"}},{"count":1,"MovieRef":{"ref":"VODVOD9845100"}},{"count":1,"MovieRef":{"ref":"VODVOD10721150"}},{"count":1,"MovieRef":{"ref":"VODVOD10546250"}},{"count":1,"MovieRef":{"ref":"VODVOD10488100"}},{"count":1,"MovieRef":{"ref":"VODVOD10479100"}},{"count":1,"MovieRef":{"ref":"VODVOD10437100"}},{"count":1,"MovieRef":{"ref":"VODVOD9842100"}},{"count":1,"MovieRef":{"ref":"VODVOD9859150"}},{"count":1,"MovieRef":{"ref":"VODVOD9931100"}},{"count":1,"MovieRef":{"ref":"VODVOD9276150"}},{"count":1,"MovieRef":{"ref":"VODVOD9276100"}},{"count":1,"MovieRef":{"ref":"VODVOD9252200"}},{"count":1,"MovieRef":{"ref":"VODVOD9087100"}},{"count":1,"MovieRef":{"ref":"VODVOD9093100"}},{"count":1,"MovieRef":{"ref":"VODVOD9067150"}},{"count":1,"MovieRef":{"ref":"VODVOD9067100"}},{"count":1,"MovieRef":{"ref":"VODVOD9066150"}},{"count":1,"MovieRef":{"ref":"VODVOD9040100"}},{"count":1,"MovieRef":{"ref":"VODVOD8689100"}},{"count":1,"MovieRef":{"ref":"VODVOD8506100"}},{"count":1,"MovieRef":{"ref":"VODVOD8517100"}},{"count":1,"MovieRef":{"ref":"VODVOD8503150"}},{"count":1,"MovieRef":{"ref":"VODVOD8448100"}},{"count":1,"MovieRef":{"ref":"VODVOD7813100"}},{"count":1,"MovieRef":{"ref":"VODVOD7763100"}},{"count":1,"MovieRef":{"ref":"VODVOD7754100"}},{"count":1,"MovieRef":{"ref":"VODVOD7754150"}},{"count":1,"MovieRef":{"ref":"VODVOD7694150"}},{"count":1,"MovieRef":{"ref":"VODVOD7693100"}},{"count":1,"MovieRef":{"ref":"VODVOD7577200"}},{"count":1,"MovieRef":{"ref":"VODVOD7546150"}},{"count":1,"MovieRef":{"ref":"VODVOD7590100"}}]
             */

            private int totalDisplayItems;
            private int count;
            private List<DisplayItemBean> DisplayItem;

            public int getTotalDisplayItems() {
                return totalDisplayItems;
            }

            public void setTotalDisplayItems(int totalDisplayItems) {
                this.totalDisplayItems = totalDisplayItems;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public List<DisplayItemBean> getDisplayItem() {
                return DisplayItem;
            }

            public void setDisplayItem(List<DisplayItemBean> DisplayItem) {
                this.DisplayItem = DisplayItem;
            }

            public static class DisplayItemBean {
                /**
                 * count : 1
                 * MovieRef : {"ref":"skynetBSKY2013112710442058"}
                 */

                private int count;
                private MovieRefBean MovieRef;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public MovieRefBean getMovieRef() {
                    return MovieRef;
                }

                public void setMovieRef(MovieRefBean MovieRef) {
                    this.MovieRef = MovieRef;
                }

                public static class MovieRefBean {
                    /**
                     * ref : skynetBSKY2013112710442058
                     */

                    private String ref;

                    public String getRef() {
                        return ref;
                    }

                    public void setRef(String ref) {
                        this.ref = ref;
                    }
                }
            }
        }

        public static class PricingBean {
            private List<PriceBean> Price;

            public List<PriceBean> getPrice() {
                return Price;
            }

            public void setPrice(List<PriceBean> Price) {
                this.Price = Price;
            }

            public static class PriceBean {


                private MovieRefBeanX MovieRef;
                private UpsellingBean Upselling;
                private InvoicePriceBean InvoicePrice;

                public MovieRefBeanX getMovieRef() {
                    return MovieRef;
                }

                public void setMovieRef(MovieRefBeanX MovieRef) {
                    this.MovieRef = MovieRef;
                }

                public UpsellingBean getUpselling() {
                    return Upselling;
                }

                public void setUpselling(UpsellingBean Upselling) {
                    this.Upselling = Upselling;
                }

                public InvoicePriceBean getInvoicePrice() {
                    return InvoicePrice;
                }

                public void setInvoicePrice(InvoicePriceBean InvoicePrice) {
                    this.InvoicePrice = InvoicePrice;
                }

                public static class MovieRefBeanX {
                    /**
                     * ref : skynetBSKY2013112710442058
                     */

                    private String ref;

                    public String getRef() {
                        return ref;
                    }

                    public void setRef(String ref) {
                        this.ref = ref;
                    }
                }

                public static class UpsellingBean {


                    private boolean UpsellingPossible;
                    //private UpsellablePackagesBean UpsellablePackages;

                    public boolean isUpsellingPossible() {
                        return UpsellingPossible;
                    }

                    public void setUpsellingPossible(boolean UpsellingPossible) {
                        this.UpsellingPossible = UpsellingPossible;
                    }

                    /*public UpsellablePackagesBean getUpsellablePackages() {
                        return UpsellablePackages;
                    }

                    public void setUpsellablePackages(UpsellablePackagesBean UpsellablePackages) {
                        this.UpsellablePackages = UpsellablePackages;
                    }*/

                    /*public static class UpsellablePackagesBean {


                        private transient String USOC;

                        public String getUSOC() {
                            return USOC;
                        }

                        public void setUSOC(String USOC) {
                            this.USOC = USOC;
                        }
                    }*/
                }

                public static class InvoicePriceBean {
                    /**
                     * ActualPrice : 0.75
                     * PriceDeterminationResult : AssetPriceOverridenByPackagePrice
                     * USOC : 1212
                     */

                    private double ActualPrice;
                    private String PriceDeterminationResult;
                    private transient  int USOC;

                    public double getActualPrice() {
                        return ActualPrice;
                    }

                    public void setActualPrice(double ActualPrice) {
                        this.ActualPrice = ActualPrice;
                    }

                    public String getPriceDeterminationResult() {
                        return PriceDeterminationResult;
                    }

                    public void setPriceDeterminationResult(String PriceDeterminationResult) {
                        this.PriceDeterminationResult = PriceDeterminationResult;
                    }

                    public int getUSOC() {
                        return USOC;
                    }

                    public void setUSOC(int USOC) {
                        this.USOC = USOC;
                    }
                }
            }
        }

        public static class MoviesBean {

            private int totalMovies;
            private List<MovieBean> Movie;

            public int getTotalMovies() {
                return totalMovies;
            }

            public void setTotalMovies(int totalMovies) {
                this.totalMovies = totalMovies;
            }

            public List<MovieBean> getMovie() {
                return Movie;
            }

            public void setMovie(List<MovieBean> Movie) {
                this.Movie = Movie;
            }

            public static class MovieBean {

                private String Subtype;
                private int ID;
                private String Title;
                private String SortName;
                //private ActorsBean Actors;
                private transient DirectorsBean Directors;
                private String Artists;
                private String Producers;
                private RentalItemsBean RentalItems;
                private long LicenseBeginDate;
                private long LicenseEndDate;
                private String RatingType;
                private String RatingCode;
                private boolean HasER;
                private String ExtendedRatingsList;
                private String StarRatingCode;
                private String ItemURL;
                private String ExternalID;
                private MediaDistributionProfilesBean MediaDistributionProfiles;
                private MediaAssetsBean MediaAssets;
                private String PreviewURL;
                private String JPEG;
                private String AssetURL;
                private int BitRate;
                private boolean HDContent;
                private String Resolution;
                private boolean IS3DContent;
                private AvailMDPsBean AvailMDPs;
                private int Runtime;
                private boolean isChargeable;
                private boolean isNewRelease;
                private boolean isAnimatedProgram;
                private boolean isBlackandWhite;
                private boolean isInfomercial;
                private boolean isLetterBoxVersion;
                private boolean isLocked;
                private boolean isSeasonalProgram;
                private boolean isSurroundSound;
                private boolean isMusicVideo;
                private boolean isExtendable;
                private boolean ComingSoonFlag;
                private String shortDescription;
                private String longDescription;
                private String LanguageType;
                private String AudioLanguage;
                private String SubTitleLanguage;
                private int SecurityCode;
                private String SecurityDescription;
                private int SecurityOption;
                private String SecurityOptionDescription;
                private transient  ProtectionSettingListBean ProtectionSettingList;
                private String ProviderName;
                private String ProviderLogoName;
                private VODPackageListBean VODPackageList;
                private transient GroupCategoriesBean GroupCategories;
                private boolean SignalInfoPage;
                private String InfoPage;
                private int BoxOfficeGross;
                private int ReleaseYear;
                private int HomeReleaseDate;
                private int HomeReleaseEndDate;
                private int NumberOfRentals;

                public String getSubtype() {
                    return Subtype;
                }

                public void setSubtype(String Subtype) {
                    this.Subtype = Subtype;
                }

                public int getID() {
                    return ID;
                }

                public void setID(int ID) {
                    this.ID = ID;
                }

                public String getTitle() {
                    return Title;
                }

                public void setTitle(String Title) {
                    this.Title = Title;
                }

                public String getSortName() {
                    return SortName;
                }

                public void setSortName(String SortName) {
                    this.SortName = SortName;
                }

               /* public ActorsBean getActors() {
                    return Actors;
                }

                public void setActors(ActorsBean Actors) {
                    this.Actors = Actors;
                }*/

                public DirectorsBean getDirectors() {
                    return Directors;
                }

                public void setDirectors(DirectorsBean Directors) {
                    this.Directors = Directors;
                }

                public String getArtists() {
                    return Artists;
                }

                public void setArtists(String Artists) {
                    this.Artists = Artists;
                }

                public String getProducers() {
                    return Producers;
                }

                public void setProducers(String Producers) {
                    this.Producers = Producers;
                }

                public RentalItemsBean getRentalItems() {
                    return RentalItems;
                }

                public void setRentalItems(RentalItemsBean RentalItems) {
                    this.RentalItems = RentalItems;
                }

                public long getLicenseBeginDate() {
                    return LicenseBeginDate;
                }

                public void setLicenseBeginDate(long LicenseBeginDate) {
                    this.LicenseBeginDate = LicenseBeginDate;
                }

                public long getLicenseEndDate() {
                    return LicenseEndDate;
                }

                public void setLicenseEndDate(long LicenseEndDate) {
                    this.LicenseEndDate = LicenseEndDate;
                }

                public String getRatingType() {
                    return RatingType;
                }

                public void setRatingType(String RatingType) {
                    this.RatingType = RatingType;
                }

                public String getRatingCode() {
                    return RatingCode;
                }

                public void setRatingCode(String RatingCode) {
                    this.RatingCode = RatingCode;
                }

                public boolean isHasER() {
                    return HasER;
                }

                public void setHasER(boolean HasER) {
                    this.HasER = HasER;
                }

                public String getExtendedRatingsList() {
                    return ExtendedRatingsList;
                }

                public void setExtendedRatingsList(String ExtendedRatingsList) {
                    this.ExtendedRatingsList = ExtendedRatingsList;
                }

                public String getStarRatingCode() {
                    return StarRatingCode;
                }

                public void setStarRatingCode(String StarRatingCode) {
                    this.StarRatingCode = StarRatingCode;
                }

                public String getItemURL() {
                    return ItemURL;
                }

                public void setItemURL(String ItemURL) {
                    this.ItemURL = ItemURL;
                }

                public String getExternalID() {
                    return ExternalID;
                }

                public void setExternalID(String ExternalID) {
                    this.ExternalID = ExternalID;
                }

                public MediaDistributionProfilesBean getMediaDistributionProfiles() {
                    return MediaDistributionProfiles;
                }

                public void setMediaDistributionProfiles(MediaDistributionProfilesBean MediaDistributionProfiles) {
                    this.MediaDistributionProfiles = MediaDistributionProfiles;
                }

                public MediaAssetsBean getMediaAssets() {
                    return MediaAssets;
                }

                public void setMediaAssets(MediaAssetsBean MediaAssets) {
                    this.MediaAssets = MediaAssets;
                }

                public String getPreviewURL() {
                    return PreviewURL;
                }

                public void setPreviewURL(String PreviewURL) {
                    this.PreviewURL = PreviewURL;
                }

                public String getJPEG() {
                    return JPEG;
                }

                public void setJPEG(String JPEG) {
                    this.JPEG = JPEG;
                }

                public String getAssetURL() {
                    return AssetURL;
                }

                public void setAssetURL(String AssetURL) {
                    this.AssetURL = AssetURL;
                }

                public int getBitRate() {
                    return BitRate;
                }

                public void setBitRate(int BitRate) {
                    this.BitRate = BitRate;
                }

                public boolean isHDContent() {
                    return HDContent;
                }

                public void setHDContent(boolean HDContent) {
                    this.HDContent = HDContent;
                }

                public String getResolution() {
                    return Resolution;
                }

                public void setResolution(String Resolution) {
                    this.Resolution = Resolution;
                }

                public boolean isIS3DContent() {
                    return IS3DContent;
                }

                public void setIS3DContent(boolean IS3DContent) {
                    this.IS3DContent = IS3DContent;
                }

                public AvailMDPsBean getAvailMDPs() {
                    return AvailMDPs;
                }

                public void setAvailMDPs(AvailMDPsBean AvailMDPs) {
                    this.AvailMDPs = AvailMDPs;
                }

                public int getRuntime() {
                    return Runtime;
                }

                public void setRuntime(int Runtime) {
                    this.Runtime = Runtime;
                }

                public boolean isIsChargeable() {
                    return isChargeable;
                }

                public void setIsChargeable(boolean isChargeable) {
                    this.isChargeable = isChargeable;
                }

                public boolean isIsNewRelease() {
                    return isNewRelease;
                }

                public void setIsNewRelease(boolean isNewRelease) {
                    this.isNewRelease = isNewRelease;
                }

                public boolean isIsAnimatedProgram() {
                    return isAnimatedProgram;
                }

                public void setIsAnimatedProgram(boolean isAnimatedProgram) {
                    this.isAnimatedProgram = isAnimatedProgram;
                }

                public boolean isIsBlackandWhite() {
                    return isBlackandWhite;
                }

                public void setIsBlackandWhite(boolean isBlackandWhite) {
                    this.isBlackandWhite = isBlackandWhite;
                }

                public boolean isIsInfomercial() {
                    return isInfomercial;
                }

                public void setIsInfomercial(boolean isInfomercial) {
                    this.isInfomercial = isInfomercial;
                }

                public boolean isIsLetterBoxVersion() {
                    return isLetterBoxVersion;
                }

                public void setIsLetterBoxVersion(boolean isLetterBoxVersion) {
                    this.isLetterBoxVersion = isLetterBoxVersion;
                }

                public boolean isIsLocked() {
                    return isLocked;
                }

                public void setIsLocked(boolean isLocked) {
                    this.isLocked = isLocked;
                }

                public boolean isIsSeasonalProgram() {
                    return isSeasonalProgram;
                }

                public void setIsSeasonalProgram(boolean isSeasonalProgram) {
                    this.isSeasonalProgram = isSeasonalProgram;
                }

                public boolean isIsSurroundSound() {
                    return isSurroundSound;
                }

                public void setIsSurroundSound(boolean isSurroundSound) {
                    this.isSurroundSound = isSurroundSound;
                }

                public boolean isIsMusicVideo() {
                    return isMusicVideo;
                }

                public void setIsMusicVideo(boolean isMusicVideo) {
                    this.isMusicVideo = isMusicVideo;
                }

                public boolean isIsExtendable() {
                    return isExtendable;
                }

                public void setIsExtendable(boolean isExtendable) {
                    this.isExtendable = isExtendable;
                }

                public boolean isComingSoonFlag() {
                    return ComingSoonFlag;
                }

                public void setComingSoonFlag(boolean ComingSoonFlag) {
                    this.ComingSoonFlag = ComingSoonFlag;
                }

                public String getShortDescription() {
                    return shortDescription;
                }

                public void setShortDescription(String shortDescription) {
                    this.shortDescription = shortDescription;
                }

                public String getLongDescription() {
                    return longDescription;
                }

                public void setLongDescription(String longDescription) {
                    this.longDescription = longDescription;
                }

                public String getLanguageType() {
                    return LanguageType;
                }

                public void setLanguageType(String LanguageType) {
                    this.LanguageType = LanguageType;
                }

                public String getAudioLanguage() {
                    return AudioLanguage;
                }

                public void setAudioLanguage(String AudioLanguage) {
                    this.AudioLanguage = AudioLanguage;
                }

                public String getSubTitleLanguage() {
                    return SubTitleLanguage;
                }

                public void setSubTitleLanguage(String SubTitleLanguage) {
                    this.SubTitleLanguage = SubTitleLanguage;
                }

                public int getSecurityCode() {
                    return SecurityCode;
                }

                public void setSecurityCode(int SecurityCode) {
                    this.SecurityCode = SecurityCode;
                }

                public String getSecurityDescription() {
                    return SecurityDescription;
                }

                public void setSecurityDescription(String SecurityDescription) {
                    this.SecurityDescription = SecurityDescription;
                }

                public int getSecurityOption() {
                    return SecurityOption;
                }

                public void setSecurityOption(int SecurityOption) {
                    this.SecurityOption = SecurityOption;
                }

                public String getSecurityOptionDescription() {
                    return SecurityOptionDescription;
                }

                public void setSecurityOptionDescription(String SecurityOptionDescription) {
                    this.SecurityOptionDescription = SecurityOptionDescription;
                }

                public ProtectionSettingListBean getProtectionSettingList() {
                    return ProtectionSettingList;
                }

                public void setProtectionSettingList(ProtectionSettingListBean ProtectionSettingList) {
                    this.ProtectionSettingList = ProtectionSettingList;
                }

                public String getProviderName() {
                    return ProviderName;
                }

                public void setProviderName(String ProviderName) {
                    this.ProviderName = ProviderName;
                }

                public String getProviderLogoName() {
                    return ProviderLogoName;
                }

                public void setProviderLogoName(String ProviderLogoName) {
                    this.ProviderLogoName = ProviderLogoName;
                }

                public VODPackageListBean getVODPackageList() {
                    return VODPackageList;
                }

                public void setVODPackageList(VODPackageListBean VODPackageList) {
                    this.VODPackageList = VODPackageList;
                }

                public GroupCategoriesBean getGroupCategories() {
                    return GroupCategories;
                }

                public void setGroupCategories(GroupCategoriesBean GroupCategories) {
                    this.GroupCategories = GroupCategories;
                }

                public boolean isSignalInfoPage() {
                    return SignalInfoPage;
                }

                public void setSignalInfoPage(boolean SignalInfoPage) {
                    this.SignalInfoPage = SignalInfoPage;
                }

                public String getInfoPage() {
                    return InfoPage;
                }

                public void setInfoPage(String InfoPage) {
                    this.InfoPage = InfoPage;
                }

                public int getBoxOfficeGross() {
                    return BoxOfficeGross;
                }

                public void setBoxOfficeGross(int BoxOfficeGross) {
                    this.BoxOfficeGross = BoxOfficeGross;
                }

                public int getReleaseYear() {
                    return ReleaseYear;
                }

                public void setReleaseYear(int ReleaseYear) {
                    this.ReleaseYear = ReleaseYear;
                }

                public int getHomeReleaseDate() {
                    return HomeReleaseDate;
                }

                public void setHomeReleaseDate(int HomeReleaseDate) {
                    this.HomeReleaseDate = HomeReleaseDate;
                }

                public int getHomeReleaseEndDate() {
                    return HomeReleaseEndDate;
                }

                public void setHomeReleaseEndDate(int HomeReleaseEndDate) {
                    this.HomeReleaseEndDate = HomeReleaseEndDate;
                }

                public int getNumberOfRentals() {
                    return NumberOfRentals;
                }

                public void setNumberOfRentals(int NumberOfRentals) {
                    this.NumberOfRentals = NumberOfRentals;
                }

               /* public static class ActorsBean {
                    private transient  List<String> Actor;

                    public List<String> getActor() {
                        return Actor;
                    }

                    public void setActor(List<String> Actor) {
                        this.Actor = Actor;
                    }
                }*/

                public static class DirectorsBean {
                    /**
                     * Director : Tim Burton
                     */

                    private String Director;

                    public String getDirector() {
                        return Director;
                    }

                    public void setDirector(String Director) {
                        this.Director = Director;
                    }
                }

                public static class RentalItemsBean {
                    /**
                     * RentalType : FOD
                     * RentalTRC : {"code":"N"}
                     */

                    private String RentalType;
                    private RentalTRCBean RentalTRC;

                    public String getRentalType() {
                        return RentalType;
                    }

                    public void setRentalType(String RentalType) {
                        this.RentalType = RentalType;
                    }

                    public RentalTRCBean getRentalTRC() {
                        return RentalTRC;
                    }

                    public void setRentalTRC(RentalTRCBean RentalTRC) {
                        this.RentalTRC = RentalTRC;
                    }

                    public static class RentalTRCBean {
                        /**
                         * code : N
                         */

                        private String code;

                        public String getCode() {
                            return code;
                        }

                        public void setCode(String code) {
                            this.code = code;
                        }
                    }
                }

                public static class MediaDistributionProfilesBean {
                    /**
                     * MediaDistributionProfile : {"ExternalID":"IPTV","MediaTypeProfiles":{"MediaTypeProfile":{"ExternalID":"SD_ENCRYPTED"}},"active":true}
                     */

                    private MediaDistributionProfileBean MediaDistributionProfile;

                    public MediaDistributionProfileBean getMediaDistributionProfile() {
                        return MediaDistributionProfile;
                    }

                    public void setMediaDistributionProfile(MediaDistributionProfileBean MediaDistributionProfile) {
                        this.MediaDistributionProfile = MediaDistributionProfile;
                    }

                    public static class MediaDistributionProfileBean {
                        /**
                         * ExternalID : IPTV
                         * MediaTypeProfiles : {"MediaTypeProfile":{"ExternalID":"SD_ENCRYPTED"}}
                         * active : true
                         */

                        private String ExternalID;
                        private MediaTypeProfilesBean MediaTypeProfiles;
                        private boolean active;

                        public String getExternalID() {
                            return ExternalID;
                        }

                        public void setExternalID(String ExternalID) {
                            this.ExternalID = ExternalID;
                        }

                        public MediaTypeProfilesBean getMediaTypeProfiles() {
                            return MediaTypeProfiles;
                        }

                        public void setMediaTypeProfiles(MediaTypeProfilesBean MediaTypeProfiles) {
                            this.MediaTypeProfiles = MediaTypeProfiles;
                        }

                        public boolean isActive() {
                            return active;
                        }

                        public void setActive(boolean active) {
                            this.active = active;
                        }

                        public static class MediaTypeProfilesBean {
                            /**
                             * MediaTypeProfile : {"ExternalID":"SD_ENCRYPTED"}
                             */

                            private MediaTypeProfileBean MediaTypeProfile;

                            public MediaTypeProfileBean getMediaTypeProfile() {
                                return MediaTypeProfile;
                            }

                            public void setMediaTypeProfile(MediaTypeProfileBean MediaTypeProfile) {
                                this.MediaTypeProfile = MediaTypeProfile;
                            }

                            public static class MediaTypeProfileBean {
                                /**
                                 * ExternalID : SD_ENCRYPTED
                                 */

                                private String ExternalID;

                                public String getExternalID() {
                                    return ExternalID;
                                }

                                public void setExternalID(String ExternalID) {
                                    this.ExternalID = ExternalID;
                                }
                            }
                        }
                    }
                }

                public static class MediaAssetsBean {
                    /**
                     * MediaAsset : {"MTP":{"ExternalID":"SD_ENCRYPTED"},"PreviewAsset":"E-Ent-1A-1Subt-1txt_0","PosterAsset":"sky_90103936602002frm03.jpg"}
                     */

                    private MediaAssetBean MediaAsset;

                    public MediaAssetBean getMediaAsset() {
                        return MediaAsset;
                    }

                    public void setMediaAsset(MediaAssetBean MediaAsset) {
                        this.MediaAsset = MediaAsset;
                    }

                    public static class MediaAssetBean {
                        /**
                         * MTP : {"ExternalID":"SD_ENCRYPTED"}
                         * PreviewAsset : E-Ent-1A-1Subt-1txt_0
                         * PosterAsset : sky_90103936602002frm03.jpg
                         */

                        private MTPBean MTP;
                        private String PreviewAsset;
                        private String PosterAsset;

                        public MTPBean getMTP() {
                            return MTP;
                        }

                        public void setMTP(MTPBean MTP) {
                            this.MTP = MTP;
                        }

                        public String getPreviewAsset() {
                            return PreviewAsset;
                        }

                        public void setPreviewAsset(String PreviewAsset) {
                            this.PreviewAsset = PreviewAsset;
                        }

                        public String getPosterAsset() {
                            return PosterAsset;
                        }

                        public void setPosterAsset(String PosterAsset) {
                            this.PosterAsset = PosterAsset;
                        }

                        public static class MTPBean {
                            /**
                             * ExternalID : SD_ENCRYPTED
                             */

                            private String ExternalID;

                            public String getExternalID() {
                                return ExternalID;
                            }

                            public void setExternalID(String ExternalID) {
                                this.ExternalID = ExternalID;
                            }
                        }
                    }
                }

                public static class AvailMDPsBean {
                    /**
                     * MDP : {"MDPID":"IPTV"}
                     */

                    private MDPBean MDP;

                    public MDPBean getMDP() {
                        return MDP;
                    }

                    public void setMDP(MDPBean MDP) {
                        this.MDP = MDP;
                    }

                    public static class MDPBean {
                        /**
                         * MDPID : IPTV
                         */

                        private String MDPID;

                        public String getMDPID() {
                            return MDPID;
                        }

                        public void setMDPID(String MDPID) {
                            this.MDPID = MDPID;
                        }
                    }
                }

                public static class ProtectionSettingListBean {
                    private List<ProtectionSchemeBean> ProtectionScheme;

                    public List<ProtectionSchemeBean> getProtectionScheme() {
                        return ProtectionScheme;
                    }

                    public void setProtectionScheme(List<ProtectionSchemeBean> ProtectionScheme) {
                        this.ProtectionScheme = ProtectionScheme;
                    }

                    public static class ProtectionSchemeBean {
                        /**
                         * Code : 1
                         * Option : 00000001
                         */

                        private int Code;
                        private String Option;

                        public int getCode() {
                            return Code;
                        }

                        public void setCode(int Code) {
                            this.Code = Code;
                        }

                        public String getOption() {
                            return Option;
                        }

                        public void setOption(String Option) {
                            this.Option = Option;
                        }
                    }
                }

                public static class VODPackageListBean {
                    private List<Integer> VODPackage;

                    public List<Integer> getVODPackage() {
                        return VODPackage;
                    }

                    public void setVODPackage(List<Integer> VODPackage) {
                        this.VODPackage = VODPackage;
                    }
                }

                public static class GroupCategoriesBean {
                    private List<CategoryRefBean> CategoryRef;

                    public List<CategoryRefBean> getCategoryRef() {
                        return CategoryRef;
                    }

                    public void setCategoryRef(List<CategoryRefBean> CategoryRef) {
                        this.CategoryRef = CategoryRef;
                    }

                    public static class CategoryRefBean {
                        /**
                         * CategoryID : 406640
                         * Position : 10
                         */

                        private int CategoryID;
                        private int Position;

                        public int getCategoryID() {
                            return CategoryID;
                        }

                        public void setCategoryID(int CategoryID) {
                            this.CategoryID = CategoryID;
                        }

                        public int getPosition() {
                            return Position;
                        }

                        public void setPosition(int Position) {
                            this.Position = Position;
                        }
                    }
                }
            }
        }
    }
}
